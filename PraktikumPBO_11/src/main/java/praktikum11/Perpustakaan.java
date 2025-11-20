/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
        bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("DAFTAR BUKU PERPUSTAKAAN");
        for (Buku b : bukuList) {
            b.infoBuku();
        }
    }
}
