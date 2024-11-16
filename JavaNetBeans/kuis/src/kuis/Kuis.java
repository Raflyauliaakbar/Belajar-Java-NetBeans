package kuis;

public class Kuis {

    public static void main(String[] args) {
       mobil avanza = new mobil();
       avanza.platNo= 123;
       avanza.namaMobil= "kijang";
       avanza.merekMobil= "toyota";
        System.out.println("nama mobil= " + avanza.namaMobil);
        System.out.println("plat no = "+ avanza.platNo);
        System.out.println("merek = "+ avanza.merekMobil);
    }
    
}
