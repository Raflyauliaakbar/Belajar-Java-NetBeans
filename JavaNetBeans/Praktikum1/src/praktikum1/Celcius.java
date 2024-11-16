/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.p1;

/**
 *
 * @author user
 */
public class Celcius {
    private double celcius;
    
    public Celcius(){};

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }
    
    public double getFahreneit(){
        return (this.getCelcius() * (9.0/5.0)) + 32;
    }
    
    public double getKelvin(){
        return this.getCelcius() + 273.15;
    }
    
    public double getReamur(){
        return this.getCelcius() * 4.0 / 5.0;
    }
}
