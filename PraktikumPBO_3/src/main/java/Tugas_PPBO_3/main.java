/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PPBO_3;

/**
 *
 * @author LOQ
 */
public class main {
    public static void main(String args[]) {
        Mobil mobil1 = new Mobil("BYD", "Dolphin", 2024, "Atlantis grey");
        mobil1.displayInfo();
        mobil1.startEngine();

        Mobil mobil2 = new Mobil("HYUNDAI", "Ioniq 5", 2025, "White matte");
        mobil2.displayInfo();
        mobil2.startEngine();

        mobil1.setWarna("Ski White");
        System.out.println("\nWarnanya diubah menjadi:");
        mobil2.displayInfo();
    }
}
