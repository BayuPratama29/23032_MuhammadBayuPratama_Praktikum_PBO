/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan5;

/**
 *
 * @author lenovo
 */
// Class utama untuk menjalankan program
public class DemoBangunRuang {
    public static void main(String[] args) {
        // Membuat objek Balok
        Balok balok = new Balok(5, 3, 2);
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
        
        // Membuat objek Kubus
        Kubus kubus = new Kubus(4);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}
