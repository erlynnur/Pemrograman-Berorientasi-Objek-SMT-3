/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO4;

/**
 *
 * @author LOQ
 */
public class Mobil extends Kendaraan1 {
    private int jumlahPintu;

    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfoMobilLengkap() {
        super.tampilkanInfoKendaraan1();
        System.out.println("Jumlah Pintu    : " + jumlahPintu);
    }
    
}
