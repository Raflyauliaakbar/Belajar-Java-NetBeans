/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.p1;

public class Kubus extends Persegi {

    public Kubus(double sisi) {
        super(sisi);
    }
    
    public double getVolume(){
        return this.getLuas() * this.getSisi();
    }
    
    public double getLuasPermukaan(){
        return this.getLuas() * 6;
    }
}
