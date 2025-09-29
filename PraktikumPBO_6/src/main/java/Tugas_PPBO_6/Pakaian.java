/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PPBO_6;

/**
 *
 * @author LOQ
 */
public class Pakaian extends produk {

    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon pakaian 5%
        return harga * 0.05;
    }
}
