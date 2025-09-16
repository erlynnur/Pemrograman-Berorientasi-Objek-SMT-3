/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO4;

/**
 *
 * @author LOQ
 */
public class Main_Mobil {
    public static void main(String[] args) {
        // Membuat objek Mobil dengan data BYD Dolphin
        Mobil bydDolphin = new Mobil("BYD Dolphin", 160, "Electric Motor", 4);

        // Menampilkan info lengkap mobil
        bydDolphin.tampilkanInfoMobilLengkap();
    }
}
