/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5;

/**
 *
 * @author lenovo
 */
// Class Balok yang meng-extend BangunRuang
class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;
    
    // Constructor untuk Balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // Implementasi metode hitungVolume
    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
    // Implementasi metode hitungLuasPermukaan
    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}