/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PPBO_6;

/**
 *
 * @author LOQ
 */
public class Main {
    public static void main(String[] args) {
        // Membuat keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Membuat beberapa produk
        produk buku = new Buku("Abimanyu dan ENRM", 200_000);
        produk laptop = new Elektronik("Laptop Lenovo", 10_000_000);
        produk kaos = new Pakaian("Jersey", 110_000);

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(kaos);

        // Menampilkan daftar produk
        keranjang.tampilkanProduk();

        // Menampilkan total harga setelah diskon
        System.out.println("Total Harga Setelah Diskon: " + keranjang.totalHargaSetelahDiskon());
    }
}