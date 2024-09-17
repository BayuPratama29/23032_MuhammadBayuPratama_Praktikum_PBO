/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan3;

/**
 *
 * @author muham
 */
public class Matematika {

   public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Tidak bisa membagi dengan 0");
            return 0;
        }
        return (double) a / b;
    }
}

// Class Matematika2 yang mewarisi class Matematika
class Matematika2 extends Matematika {
    public int modulus(int a, int b) {
        return a % b;
    }
}
