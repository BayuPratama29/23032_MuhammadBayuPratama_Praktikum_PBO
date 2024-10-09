/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ProgramUntukMenghitungBerbagaiDeret;

/**
 *
 * @author lenovo
 */
public class PrimaBukanPrima {
    public static void main(String[] args) {
        // Menampilkan bilangan prima antara 0 dan 20
        System.out.println("Bilangan prima antara 0 dan 20:");
        for (int i = 2; i <= 20; i++) {
            // Memeriksa apakah angka prima
            if (adalahPrima(i)) {
                System.out.print(i + " ");
            }
        }

        // Menampilkan bilangan bukan prima antara 0 dan 20
        System.out.println("\nBilangan bukan prima antara 0 dan 20:");
        for (int i = 0; i <= 20; i++) {
            // Memeriksa apakah angka bukan prima
            if (!adalahPrima(i) && i > 1) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk memeriksa apakah sebuah bilangan prima
    public static boolean adalahPrima(int n) {
        if (n <= 1) return false; // Angka <= 1 bukan prima
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Jika bilangan habis dibagi, maka bukan prima
            if (n % i == 0) return false;
        }
        return true; // Jika tidak habis dibagi angka lain, maka prima
    }
}
