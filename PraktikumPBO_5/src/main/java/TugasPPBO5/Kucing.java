/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPPBO5;

/**
 *
 * @author LOQ
 */
public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }
    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + "\nSuara: Meow";
    }
}