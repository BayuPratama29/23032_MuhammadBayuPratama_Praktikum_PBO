/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pertemuan10;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lenovo
 */
public class AplikasiNilaiMahasiswa extends JFrame {
    private JTextField nimTF, namaTF, alamatTF, mataKuliahTF;
    private JTextField nilai1TF, nilai2TF, nilai3TF, nilai4TF, nilai5TF, nilaiAkhirTF;
    private DefaultTableModel modelTabel;

    public AplikasiNilaiMahasiswa() {
        setTitle("Aplikasi Nilai Mahasiswa");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Label dan Text Field
        JLabel nimLabel = new JLabel("NIM");
        nimLabel.setBounds(20, 20, 100, 25);
        add(nimLabel);
        nimTF = new JTextField();
        nimTF.setBounds(120, 20, 150, 25);
        add(nimTF);

        JLabel namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 50, 100, 25);
        add(namaLabel);
        namaTF = new JTextField();
        namaTF.setBounds(120, 50, 150, 25);
        add(namaTF);

        JLabel alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(20, 80, 100, 25);
        add(alamatLabel);
        alamatTF = new JTextField();
        alamatTF.setBounds(120, 80, 150, 25);
        add(alamatTF);

        JLabel mataKuliahLabel = new JLabel("Mata Kuliah");
        mataKuliahLabel.setBounds(20, 110, 100, 25);
        add(mataKuliahLabel);
        mataKuliahTF = new JTextField();
        mataKuliahTF.setBounds(120, 110, 150, 25);
        add(mataKuliahTF);

        // Input nilai dengan bobot masing-masing
        nilai1TF = buatInputNilai("Nilai 1 [10%]", 120, 140);
        nilai2TF = buatInputNilai("Nilai 2 [15%]", 120, 170);
        nilai3TF = buatInputNilai("Nilai 3 - UTS [25%]", 120, 200);
        nilai4TF = buatInputNilai("Nilai 4 [15%]", 120, 230);
        nilai5TF = buatInputNilai("Nilai 5 [35%]", 120, 260);

        JLabel nilaiAkhirLabel = new JLabel("Nilai Akhir");
        nilaiAkhirLabel.setBounds(300, 260, 100, 25);
        add(nilaiAkhirLabel);
        nilaiAkhirTF = new JTextField();
        nilaiAkhirTF.setBounds(400, 260, 150, 25);
        nilaiAkhirTF.setEditable(false);
        add(nilaiAkhirTF);

        // Tombol
        JButton simpanButton = new JButton("Simpan");
        simpanButton.setBounds(120, 300, 80, 25);
        add(simpanButton);
        
        JButton hapusButton = new JButton("Hapus");
        hapusButton.setBounds(220, 300, 80, 25);
        add(hapusButton);

        // Tabel untuk menampilkan data
        modelTabel = new DefaultTableModel(new String[]{"NIM", "Nama", "Alamat", "Mata Kuliah", "Nilai Akhir"}, 0);
        JTable tabel = new JTable(modelTabel);
        JScrollPane scrollPane = new JScrollPane(tabel);
        scrollPane.setBounds(20, 340, 550, 100);
        add(scrollPane);

        // Action Listeners
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simpanData();
            }
        });

        hapusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hapusData(tabel);
            }
        });
    }

    private JTextField buatInputNilai(String label, int x, int y) {
        JLabel nilaiLabel = new JLabel(label);
        nilaiLabel.setBounds(x - 100, y, 100, 25);
        add(nilaiLabel);
        JTextField nilaiTF = new JTextField();
        nilaiTF.setBounds(x, y, 150, 25);
        add(nilaiTF);
        return nilaiTF;
    }

    private void simpanData() {
        // Mengambil nilai dari field
        String nim = nimTF.getText();
        String nama = namaTF.getText();
        String alamat = alamatTF.getText();
        String mataKuliah = mataKuliahTF.getText();

        // Parsing nilai dan menghitung nilai akhir
        try {
            double nilai1 = Double.parseDouble(nilai1TF.getText()) * 0.10;
            double nilai2 = Double.parseDouble(nilai2TF.getText()) * 0.15;
            double nilai3 = Double.parseDouble(nilai3TF.getText()) * 0.25;
            double nilai4 = Double.parseDouble(nilai4TF.getText()) * 0.15;
            double nilai5 = Double.parseDouble(nilai5TF.getText()) * 0.35;
            double nilaiAkhir = nilai1 + nilai2 + nilai3 + nilai4 + nilai5;

            nilaiAkhirTF.setText(String.format("%.2f", nilaiAkhir));

            // Menambahkan data ke tabel
            modelTabel.addRow(new Object[]{nim, nama, alamat, mataKuliah, nilaiAkhir});
            bersihkanField();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan nilai yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void hapusData(JTable tabel) {
        int barisTerpilih = tabel.getSelectedRow();
        if (barisTerpilih >= 0) {
            modelTabel.removeRow(barisTerpilih);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bersihkanField() {
        nimTF.setText("");
        namaTF.setText("");
        alamatTF.setText("");
        mataKuliahTF.setText("");
        nilai1TF.setText("");
        nilai2TF.setText("");
        nilai3TF.setText("");
        nilai4TF.setText("");
        nilai5TF.setText("");
        nilaiAkhirTF.setText("");
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AplikasiNilaiMahasiswa().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
