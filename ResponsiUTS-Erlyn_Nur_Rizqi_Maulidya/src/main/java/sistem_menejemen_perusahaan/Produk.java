/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_menejemen_perusahaan;

/**
 *
 * @author LOQ
 */
public class Produk {
    private String namaProduk;
    private int harga;
    
    // Constructor
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // Getter dan Setter
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    // Method untuk menampilkan info (akan di-override di child class)
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}
