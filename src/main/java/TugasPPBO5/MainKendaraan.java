/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPPBO5;

/**
 *
 * @author LOQ
 */
public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("BYD Dolphin", 160, "Listrik", 4);
        SepedaMotor sepedaMotor = new SepedaMotor("Honda Scoopy 2021", 110, "Bensin", "Mesin 110cc");
        System.out.println(mobil.tampilkanInfo());
        System.out.println();
        System.out.println(sepedaMotor.tampilkanInfo());
    }
}