/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum11;

/**
 *
 * @author LOQ
 */
public class MainTugas {
    public static void main(String[] args) {

        Pengarang p1 = new Pengarang("Alvi Syahrin");
        Pengarang p2 = new Pengarang("Pidi Baiq");
        Pengarang p3 = new Pengarang("Erlyn dan Abimanyu");

        BukuTugas b1 = new BukuTugas("insecurity", p1);
        BukuTugas b2 = new BukuTugas("Dilan 1990", p2);
        BukuTugas b3 = new BukuTugas("Cerita dulu yang belum sempat ada", p3);

        PerpustakaanTugas perpustakaan = new PerpustakaanTugas(2);

        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3);

        perpustakaan.infoPerpustakaan();
    }
}