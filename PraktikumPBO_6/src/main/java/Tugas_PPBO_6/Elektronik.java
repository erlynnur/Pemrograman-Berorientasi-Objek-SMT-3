/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PPBO_6;

/**
 *
 * @author LOQ
 */
public class Elektronik extends produk {

    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon elektronik 15%
        return harga * 0.15;
    }
}
