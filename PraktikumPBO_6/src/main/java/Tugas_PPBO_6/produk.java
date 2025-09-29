/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PPBO_6;

/**
 *
 * @author LOQ
 */
public abstract class produk {
    // Atribut dasar produk
    protected String nama;
    protected double harga;

    // Konstruktor untuk inisialisasi nama dan harga
    public produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Getter harga
    public double getHarga() {
        return harga;
    }

    // Metode abstrak untuk menghitung diskon
    public abstract double hitungDiskon();
}
