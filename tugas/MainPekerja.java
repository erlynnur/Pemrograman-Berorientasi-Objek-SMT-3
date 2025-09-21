/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author LOQ
 */
public class MainPekerja {
   public static void main(String[] args) {  
        // Membuat objek pekerja
        Pekerja pekerja1 = new Pekerja("Abimanyu", 19 , "Nahkoda", 6000000);  

        // Menampilkan informasi pekerja (Output 1)
        System.out.println("Informasi Pekerja awal:");  
        System.out.println(pekerja1.toString());  

        // Mengubah nama pekerja lewat setter
        pekerja1.setNama("Priyo");  

        // Menampilkan ulang (Output 2)  
        System.out.println("\nPekerja setelahnya:");  
        System.out.println(pekerja1.toString());
   }
}
