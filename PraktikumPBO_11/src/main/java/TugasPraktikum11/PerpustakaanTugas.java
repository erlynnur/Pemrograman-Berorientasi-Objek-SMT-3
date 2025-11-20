/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum11;

/**
 *
 * @author LOQ
 */
public class PerpustakaanTugas {
    private BukuTugas[] daftarBuku;
    private int jumlahBuku = 0;

    public PerpustakaanTugas(int kapasitas) {
        daftarBuku = new BukuTugas[kapasitas];
    }

    public void tambahBuku(BukuTugas buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Kapasitas perpustakaan penuh!");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("DAFTAR BUKU");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].infoBuku();
            System.out.println("++++++");
        }
    }
}
