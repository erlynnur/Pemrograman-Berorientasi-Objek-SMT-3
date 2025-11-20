/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author LOQ
 */
public class MainKomposisi {
    public static void main(String[] args) {

        Perpustakaan p = new Perpustakaan();

        Buku b1 = new Buku("Bahasa Inggris");
        Buku b2 = new Buku("Struktur Data");
        Buku b3 = new Buku("PBO");

        p.tambahBuku(b1);
        p.tambahBuku(b2);
        p.tambahBuku(b3);

        p.infoPerpustakaan();
    }
}
