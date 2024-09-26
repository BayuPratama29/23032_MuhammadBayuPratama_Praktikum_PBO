/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan5;

/**
 *
 * @author lenovo
 */
// Class Kubus yang meng-extend BangunRuang
class Kubus extends BangunRuang {
    private double sisi;
    
    // Constructor untuk Kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    // Implementasi metode hitungVolume
    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
    
    // Implementasi metode hitungLuasPermukaan
    @Override
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}
