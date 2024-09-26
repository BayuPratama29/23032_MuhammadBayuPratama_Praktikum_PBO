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

public class DiskonPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input total pembelian
        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = input.nextDouble();
        
        // Menghitung besarnya potongan
        double potongan;
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.20;
        }
        
        // Menghitung jumlah yang harus dibayarkan
        double totalBayar = totalPembelian - potongan;
        
        // Output
        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + totalBayar);
        
        input.close();
    }
}

