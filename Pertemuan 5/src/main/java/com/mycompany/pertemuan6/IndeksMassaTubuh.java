/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input berat dan tinggi badan
        System.out.print("Berat badan (kg): ");
        double berat = input.nextDouble();
        System.out.print("Tinggi badan (meter): ");
        double tinggi = input.nextDouble();
        
        // Menghitung IMT
        double imt = berat / (tinggi * tinggi);
        
        // Menentukan kriteria berdasarkan IMT
        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }
        
        // Output
        System.out.println("IMT Anda: " + imt);
        System.out.println("Kriteria: " + kriteria);
        
        input.close();
    }
}
