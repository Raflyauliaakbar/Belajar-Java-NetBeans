/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.p1;

/**
 *
 * @author user
 */
public class Persegi {
    protected double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double getLuas() {
        return this.getSisi() * this.getSisi();
    }
    
    public double getKeliling() {
        return this.getSisi() * 4;
    }
}
