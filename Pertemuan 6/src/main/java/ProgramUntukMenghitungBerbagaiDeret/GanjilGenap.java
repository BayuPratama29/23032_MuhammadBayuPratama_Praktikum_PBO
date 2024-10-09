/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramUntukMenghitungBerbagaiDeret;

/**
 *
 * @author lenovo
 */
public class GanjilGenap {
    public static void main(String[] args) {
        // Menampilkan bilangan ganjil antara 0 dan 20
        System.out.println("Bilangan ganjil antara 0 dan 20:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " "); // Cetak bilangan ganjil
        }

        // Menampilkan bilangan genap antara 0 dan 20
        System.out.println("\nBilangan genap antara 0 dan 20:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " "); // Cetak bilangan genap
        }
    }
}
