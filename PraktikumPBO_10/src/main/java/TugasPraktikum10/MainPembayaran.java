/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum10;

/**
 *
 * @author LOQ
 */
public class MainPembayaran {
    public static void main(String[] args) {
        Pembayaran tv = new Elektronik();
        double hargaTV = 5500000; //Rp 5.500.000
        double pajakTV = tv.hitungPajak(hargaTV);
        System.out.println("Elektronik - Harga: " + hargaTV + " | Pajak (10%): " + pajakTV);

        Pembayaran nasiBox = new Makanan();
        double hargaNasiBox = 80000; //Rp 80.000
        double pajakNasiBox = nasiBox.hitungPajak(hargaNasiBox);
        System.out.println("Makanan - Harga: " + hargaNasiBox + " | Pajak (5%): " + pajakNasiBox);

        // total bayar
        System.out.println("Total bayar TV (incl. pajak): " + (hargaTV + pajakTV));
        System.out.println("Total bayar NasiBox (incl. pajak): " + (hargaNasiBox + pajakNasiBox));
    }
}
