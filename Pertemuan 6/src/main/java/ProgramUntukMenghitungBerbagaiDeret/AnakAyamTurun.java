/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramUntukMenghitungBerbagaiDeret;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class AnakAyamTurun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah anak ayam dari pengguna
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = scanner.nextInt();

        // Loop untuk menampilkan lagu "Anak Ayam Turun N"
        for (int i = n; i > 0; i--) {
            if (i == 1) {
                // Jika anak ayam tinggal 1
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                // Jika anak ayam masih lebih dari 1
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
        }
        scanner.close(); // Menutup input scanner
    }
}

