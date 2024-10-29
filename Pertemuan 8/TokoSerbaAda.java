/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan8;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class TokoSerbaAda {

    // Data barang dalam bentuk array 2D {kode, nama barang, harga}
    static String[][] items = {
        {"a001", "Buku", "3000"},
        {"a002", "Pensil", "4000"},
        {"a003", "Pulpen", "5000"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah item yang akan diinput
        System.out.print("Masukkan Item Barang : ");
        int itemCount = scanner.nextInt();
        scanner.nextLine(); // untuk mengkonsumsi sisa karakter newline

        // Array untuk menyimpan data pembelian
        String[] kodeBarang = new String[itemCount];
        int[] jumlahBeli = new int[itemCount];
        String[] namaBarang = new String[itemCount];
        int[] hargaBarang = new int[itemCount];
        int[] jumlahBayar = new int[itemCount];

        // Total bayar keseluruhan
        int totalBayar = 0;

        // Input data barang
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode : ");
            kodeBarang[i] = scanner.nextLine();
            System.out.print("Masukkan jumlah Beli : ");
            jumlahBeli[i] = scanner.nextInt();
            scanner.nextLine(); // mengkonsumsi sisa newline

            // Mencari nama barang dan harga berdasarkan kode
            for (String[] item : items) {
                if (item[0].equals(kodeBarang[i])) {
                    namaBarang[i] = item[1];
                    hargaBarang[i] = Integer.parseInt(item[2]);
                    jumlahBayar[i] = hargaBarang[i] * jumlahBeli[i];
                    totalBayar += jumlahBayar[i];
                    break;
                }
            }
        }

        // Menampilkan hasil output
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*****************************************");
        System.out.printf("%-4s %-12s %-15s %-8s %-12s %-12s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("==========================================");

        for (int i = 0; i < itemCount; i++) {
            System.out.printf("%-4d %-12s %-15s %-8d %-12d %-12d\n", (i + 1), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], jumlahBayar[i]);
        }

        System.out.println("==========================================");
        System.out.println("Total Bayar: " + totalBayar);
        
        scanner.close();
    }
}

