/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_menejemen_perusahaan;

/**
 *
 * @author LOQ
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("### OUTPUT PRODUK ###");
        
        // Polymorphism: referensi parent class untuk object child class
        // Membuat object Elektronik dengan referensi Produk
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        produk1.tampilkanInfo(); // Memanggil method dari Elektronik (bukan Produk)
        
        System.out.println("\n### OUTPUT PEGAWAI ###");
        
        // Polymorphism: referensi parent class untuk object child class
        // Membuat object PegawaiTetap dengan referensi Pegawai
        Pegawai pegawai1 = new PegawaiTetap("Erlyn", 5000000, 1000000);
        pegawai1.tampilkanInfo(); // Memanggil method dari PegawaiTetap (bukan Pegawai)
        
        System.out.println("\n### OUTPUT POLIMORFISME ###");
        
        // Membuat object Makanan dengan referensi Produk
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
        produk2.tampilkanInfo();
        
        System.out.println();
        
        // Membuat object PegawaiKontrak dengan referensi Pegawai
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        pegawai2.tampilkanInfo();
        
    }
}