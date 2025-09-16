/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO4;

/**
 *
 * @author LOQ
 */
public class Main_kendaraan {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Toyota", "Yaris", 2023);

        System.out.println("Merek : " + mobil.getMerek());
        System.out.println("Model : " + mobil.getModel());
        System.out.println("Tahun : " + mobil.getTahun());
    
        mobil.setModel("Innova");
        mobil.setTahun(2024);

        System.out.println("-- Data Mobil Baru --");
        System.out.println("Merek : " + mobil.getMerek());
        System.out.println("Model : " + mobil.getModel());
        System.out.println("Tahun : " + mobil.getTahun());
    }
}