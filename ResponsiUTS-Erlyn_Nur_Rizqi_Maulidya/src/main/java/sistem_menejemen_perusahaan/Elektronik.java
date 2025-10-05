/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_menejemen_perusahaan;

/**
 *
 * @author LOQ
 */
public class Elektronik extends Produk {
    private int garansi; // dalam tahun
    
    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga); // memanggil constructor parent
        this.garansi = garansi;
    }
    
    public int getGaransi() {
        return garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    // Override method dari parent class
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // memanggil method parent
        System.out.println("Garansi: " + garansi + " tahun");
    }
}