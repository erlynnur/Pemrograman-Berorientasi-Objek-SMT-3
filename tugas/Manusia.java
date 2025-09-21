/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author LOQ
 */
public class Manusia {
    private String nama;          // hanya bisa diakses di dalam class Manusia
    protected int usia;           // bisa diakses di subclass atau package yang sama
    public String pekerjaan;      // bisa diakses dari mana saja

    // Constructor  
    public Manusia(String nama, int usia, String pekerjaan) {  
        this.nama = nama;  
        this.usia = usia;  
        this.pekerjaan = pekerjaan;  
    }  

    // Getter & Setter untuk nama  
    public String getNama() {  
        return nama;  
    }  

    public void setNama(String nama) {  
        this.nama = nama;  
    }  

    public void tampilinfo() {  
        System.out.println("Nama: " + getNama());  
        System.out.println("Usia: " + usia);  
        System.out.println("Pekerjaan: " + pekerjaan);  
    }  
}
