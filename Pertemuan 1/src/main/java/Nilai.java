/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
public class Nilai {
    // Variabel untuk menyimpan data nilai
    String NIM;
    String nama;
    int nilaiAbsen;
    int nilaiTugas;
    int nilaiUTS;
    int nilaiUAS;

    // Method untuk mengisi nilai (konstruktor)
    public Nilai(String NIM, String nama, int nilaiAbsen, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        this.NIM = NIM;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Method untuk mencetak nilai
    public void CetakNilai() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Absen [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS [40%] : " + nilaiUAS);

        // Hitung nilai akhir
        double nilaiAkhir = (nilaiAbsen * 0.10) + (nilaiTugas * 0.20) + (nilaiUTS * 0.30) + (nilaiUAS * 0.40);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
