/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PPBO_6;

/**
 *
 * @author LOQ
 */
import java.util.*; // Import semua kelas di java.util

public class KeranjangBelanja {
    private List<produk> daftarproduk = new ArrayList<>();

    // Menambahkan produk
    public void tambahProduk(produk p) {
        daftarproduk.add(p);
    }

    // Menghitung total harga setelah diskon
    public double totalHargaSetelahDiskon() {
        double total = 0;
        for (produk p : daftarproduk) {
            total += p.getHarga() - p.hitungDiskon();
        }
        return total;
    }

    // Menampilkan daftar produk beserta harga akhir (versi pemula)
    public void tampilkanProduk() {
        for (produk p : daftarproduk) {
            System.out.println("Nama Produk: " + p.getNama());
            System.out.println("Harga: " + p.getHarga());
            System.out.println("Diskon: " + p.hitungDiskon());
            System.out.println("Harga Akhir: " + (p.getHarga() - p.hitungDiskon()));
            System.out.println("------------------------");
        }
    }
}
