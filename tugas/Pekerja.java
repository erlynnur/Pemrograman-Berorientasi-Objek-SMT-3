/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author LOQ
 */
public class Pekerja extends Manusia {  
    private double gaji; // hanya bisa diakses di dalam class Pekerja  

    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {  
        super(nama, usia, pekerjaan);  
        this.gaji = gaji;  
    }  

    // Getter untuk gaji  
    public double getGaji() {  
        return gaji;  
    }  

    @Override  
    public String toString() {  
        return "Nama: " + getNama() +  
               ", Usia: " + usia +  
               ", Pekerjaan: " + pekerjaan +  
               ", Gaji: " + gaji;  
    }   
}
