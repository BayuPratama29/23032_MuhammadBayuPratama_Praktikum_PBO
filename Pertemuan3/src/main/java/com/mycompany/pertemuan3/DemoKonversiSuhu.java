/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author muham
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 suhu = new KonversiSuhu2();

        // Menggunakan method dari class KonversiSuhu
        System.out.println("Celcius ke Fahrenheit: " + suhu.celciusToFahrenheit(25));
        System.out.println("Celcius ke Reamur: " + suhu.celciusToReamur(25));

        // Menggunakan method dari class KonversiSuhu2
        System.out.println("Fahrenheit ke Reamur: " + suhu.fahrenheitToReamur(77));
    }
}
