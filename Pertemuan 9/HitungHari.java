/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author lenovo
 */
import java.time.YearMonth;

public class HitungHari {
    public int hitung(int tahun, int bulan) {
        // Use YearMonth to get the number of days in a specific month and year
        YearMonth yearMonth = YearMonth.of(tahun, bulan);
        return yearMonth.lengthOfMonth();
    }
}

