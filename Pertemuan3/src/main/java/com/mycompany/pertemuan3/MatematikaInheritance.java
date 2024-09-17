/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author muham
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 math = new Matematika2();

        // Menggunakan method dari class Matematika
        System.out.println("Tambah: " + math.tambah(10, 5));
        System.out.println("Kurang: " + math.kurang(10, 5));
        System.out.println("Kali: " + math.kali(10, 5));
        System.out.println("Bagi: " + math.bagi(10, 5));

        // Menggunakan method dari class Matematika2
        System.out.println("Modulus: " + math.modulus(10, 3));
    }
}
