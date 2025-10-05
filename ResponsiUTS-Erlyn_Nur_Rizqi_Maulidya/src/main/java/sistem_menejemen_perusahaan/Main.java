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
        System.out.println("### SISTEM MANAJEMEN PRODUK DAN PEGAWAI ###\n");
        
        // Demonstrasi Enkapsulasi dan Akses Modifikator
        System.out.println("1. Output Produk (Enkapsulasi)");
        Produk produk1 = new Produk("Laptop", 15000000);
        
        // Mengakses atribut menggunakan getter (enkapsulasi)
        System.out.println("Nama Produk: " + produk1.getNamaProduk());
        System.out.println("Harga: " + produk1.getHarga());
        
        // Modifikasi atribut menggunakan setter (enkapsulasi)
        produk1.setHarga(14000000);
        System.out.println("Harga setelah diubah: " + produk1.getHarga());
        System.out.println();
        
        // Demonstrasi Pewarisan - Produk Elektronik
        System.out.println("2. Output Pegawai (Pewarisan)");
        Pegawai pegawai1 = new Pegawai("Budi", 5000000);
        pegawai1.tampilkanInfo();
        System.out.println();
        
        // Demonstrasi Polimorfisme
        System.out.println("3. Output Polimorfisme");
        
        // Polimorfisme dengan array tipe parent class
        Produk[] daftarProduk = new Produk[2];
        daftarProduk[0] = new Elektronik("Laptop", 15000000, 2);
        daftarProduk[1] = new Makanan("Snack", 15000, "2023-12-30");
        
        Pegawai[] daftarPegawai = new Pegawai[2];
        daftarPegawai[0] = new PegawaiTetap("Budi (sesuaikan dengan nama kalian)", 5000000, 1000000);
        daftarPegawai[1] = new PegawaiKontrak("Andi", 3000000, 12);
        
        // Memanggil method dari objek yang berbeda melalui referensi parent
        System.out.println("### Produk Elektronik ###");
        daftarProduk[0].tampilkanInfo();
        System.out.println();
        
        System.out.println("### Produk Makanan ###");
        daftarProduk[1].tampilkanInfo();
        System.out.println();
        
        System.out.println("### Pegawai Tetap ###");
        daftarPegawai[0].tampilkanInfo();
        System.out.println();
        
        System.out.println("### Pegawai Kontrak ###");
        daftarPegawai[1].tampilkanInfo();
    }
}
