/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_3;

/**
 *
 * @author LOQ
 */
public class main {
    public static void main(String[] args) {
        hewan kucing = new hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        
        hewan anjing = new hewan("cece", 2);
        anjing.berlari();
        anjing.info();
    }
    
}
