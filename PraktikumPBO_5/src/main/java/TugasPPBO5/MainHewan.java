/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPPBO5;

/**
 *
 * @author LOQ
 */
public class MainHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Oci");
        Anjing anjing = new Anjing("Bimbim");
        System.out.println(kucing.tampilkanInfo());
        System.out.println();
        System.out.println(anjing.tampilkanInfo());
    }
}