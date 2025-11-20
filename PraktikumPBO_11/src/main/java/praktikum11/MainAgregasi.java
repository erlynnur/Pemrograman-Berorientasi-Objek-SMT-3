/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author LOQ
 */
public class MainAgregasi {
    public static void main(String[] args) {

        Anggota a1 = new Anggota("Erlyn");
        Anggota a2 = new Anggota("Abimanyu");
        Anggota a3 = new Anggota("Priyo");

        Klub klub = new Klub("Klub MIPA 3");

        klub.tambahAnggota(a1);
        klub.tambahAnggota(a2);
        klub.tambahAnggota(a3);

        klub.infoKlub();
    }
}