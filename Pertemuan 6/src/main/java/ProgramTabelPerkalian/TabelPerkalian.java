/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramTabelPerkalian;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai n dari pengguna (maksimal 10)
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();

        // Memeriksa apakah n <= 10
        if (n <= 10) {
            // Loop baris dari 1 sampai n
            for (int i = 1; i <= n; i++) {
                // Loop kolom dari 1 sampai n
                for (int j = 1; j <= n; j++) {
                    // Mencetak hasil perkalian baris x kolom
                    System.out.print(i * j + "\t");
                }
                // Pindah baris setelah mencetak satu baris penuh
                System.out.println();
            }
        } else {
            // Pesan kesalahan jika n > 10
            System.out.println("Nilai n harus kurang dari atau sama dengan 10.");
        }
        scanner.close(); // Menutup input scanner
    }
}
