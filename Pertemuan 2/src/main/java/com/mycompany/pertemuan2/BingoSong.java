/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;

/**
 *
 * @author muham
 */
public class BingoSong {
     private String name;
    private String verse;

    // Konstruktor untuk inisialisasi nama dan lirik
    public BingoSong(String name) {
        this.name = name;
        this.verse = "There was a farmer who had a dog,\n" +
                     "And Bingo was his name-o.\n";
    }

    // Menampilkan bagian lagu
    public void displaySong() {
        System.out.println(verse);
        printRepeatedVerse("B-I-N-G-O", 3);
        printVerseWithClaps();
    }

    // Menampilkan lirik dengan format clap
    private void printVerseWithClaps() {
        String[] letters = {"B", "I", "N", "G", "O"};
        for (int i = 0; i < letters.length; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            printClapsAndLetters(letters, i);
            System.out.println("And Bingo was his name-o.");
            System.out.println();
        }
    }

    // Menampilkan lirik dengan 'clap' dan huruf yang tersisa
    private void printClapsAndLetters(String[] letters, int claps) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (j < claps) {
                    System.out.print("(clap)-");
                } else {
                    System.out.print(letters[j] + "-");
                }
            }
            System.out.println();
        }
    }

    // Menampilkan bagian yang diulang
    private void printRepeatedVerse(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }
}
