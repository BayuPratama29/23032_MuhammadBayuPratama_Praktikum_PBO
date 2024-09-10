/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pertemuan2;

/**
 *
 * @author muham
 */
public interface OperasiMatematika {
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    int pembagian(int a, int b);
}

// Kelas Matematika yang mengimplementasikan interface OperasiMatematika
public class Matematika implements OperasiMatematika {
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }

    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }

    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }

    @Override
    public int pembagian(int a, int b) {
        return a / b;
    }
}

// Kelas MatematikaBeraksi tetap sama
public class MatematikaBeraksi {
    public static void main(String[] args) {
        OperasiMatematika matematika = new Matematika();

        int a1 = 20, b1 = 10;
        int a2 = 10, b2 = 5;
        int a3 = 10, b3 = 3;
        int a4 = 21, b4 = 2;

        System.out.println("Pertambahan: " + a1 + " + " + b1 + " = " + matematika.pertambahan(a1, b1));
        System.out.println("Pengurangan: " + a2 + " - " + b2 + " = " + matematika.pengurangan(a2, b2));
        System.out.println("Perkalian: " + a3 + " * " + b3 + " = " + matematika.perkalian(a3, b3));
        System.out.println("Pembagian: " + a4 + " / " + b4 + " = " + matematika.pembagian(a4, b4));
    }
}
