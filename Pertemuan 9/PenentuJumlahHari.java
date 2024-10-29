/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pertemuan9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.YearMonth;
/**
 *
 * @author lenovo
 */
public class PenentuJumlahHari extends javax.swing.JFrame {

    private JTextField inputTahun; // Input untuk tahun
    private JComboBox<String> comboBulan; // ComboBox untuk memilih bulan
    private JLabel labelHasil; // Label untuk menampilkan hasil perhitungan
    private HitungHari hitungHari; // Objek dari kelas HitungHari untuk menghitung jumlah hari

    public PenentuJumlahHari() {
        hitungHari = new HitungHari(); // Membuat objek dari kelas HitungHari

        // Mengatur judul dan ukuran jendela
        setTitle("Aplikasi Penentu Jumlah Hari");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panelUtama = new JPanel(new GridLayout(4, 1));
        panelUtama.setBackground(Color.GREEN); // Mengatur warna latar belakang panel utama
        
        // Panel input untuk tahun
        JPanel panelTahun = new JPanel();
        panelTahun.add(new JLabel("Tahun"));
        inputTahun = new JTextField(10);
        panelTahun.add(inputTahun);
        panelUtama.add(panelTahun);
        
        // Panel input untuk bulan
        JPanel panelBulan = new JPanel();
        panelBulan.add(new JLabel("Bulan"));
        // Daftar bulan dalam bahasa Indonesia
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        comboBulan = new JComboBox<>(bulan);
        panelBulan.add(comboBulan);
        panelUtama.add(panelBulan);
        
        // Label untuk menampilkan hasil
        labelHasil = new JLabel("");
        labelHasil.setHorizontalAlignment(SwingConstants.CENTER);
        labelHasil.setOpaque(true);
        labelHasil.setBackground(Color.YELLOW); // Mengatur warna latar belakang hasil
        panelUtama.add(labelHasil);
        
        // Panel tombol
        JPanel panelTombol = new JPanel();
        JButton tombolHitung = new JButton("Hitung");
        JButton tombolHapus = new JButton("Hapus");
        JButton tombolSimpan = new JButton("Simpan");
        JButton tombolKeluar = new JButton("Keluar");

        // Menambahkan aksi untuk setiap tombol
        tombolHitung.addActionListener(e -> hitungJumlahHari());
        tombolHapus.addActionListener(e -> hapusData());
        tombolSimpan.addActionListener(e -> simpanHasil());
        tombolKeluar.addActionListener(e -> System.exit(0));

        // Menambahkan tombol-tombol ke panel
        panelTombol.add(tombolHitung);
        panelTombol.add(tombolHapus);
        panelTombol.add(tombolSimpan);
        panelTombol.add(tombolKeluar);
        
        // Menambahkan panel utama dan panel tombol ke dalam jendela
        add(panelUtama, BorderLayout.CENTER);
        add(panelTombol, BorderLayout.SOUTH);
    }

    // Method untuk menghitung jumlah hari berdasarkan input tahun dan bulan
    private void hitungJumlahHari() {
        try {
            // Mengambil input tahun dari user
            int tahun = Integer.parseInt(inputTahun.getText());
            // Mengambil bulan dari ComboBox (dimulai dari 1)
            int bulan = comboBulan.getSelectedIndex() + 1;
            // Menghitung jumlah hari
            int jumlahHari = hitungHari.hitung(tahun, bulan);
            String namaBulan = (String) comboBulan.getSelectedItem();
            // Menampilkan hasil di label
            labelHasil.setText("Jumlah hari pada bulan " + namaBulan + " tahun " + tahun + " adalah " + jumlahHari);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan tahun yang valid", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method untuk mengosongkan input tahun, bulan, dan hasil perhitungan
    private void hapusData() {
        inputTahun.setText("");
        comboBulan.setSelectedIndex(0);
        labelHasil.setText("");
    }

    // Method untuk menyimpan hasil perhitungan ke file teks
    private void simpanHasil() {
        try (FileWriter writer = new FileWriter("hasil_perhitungan.txt")) {
            writer.write(labelHasil.getText());
            JOptionPane.showMessageDialog(this, "Hasil disimpan ke hasil_perhitungan.txt", "Simpan", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan hasil", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Main method untuk menjalankan aplikasi
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PenentuJumlahHari frame = new PenentuJumlahHari();
            frame.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
