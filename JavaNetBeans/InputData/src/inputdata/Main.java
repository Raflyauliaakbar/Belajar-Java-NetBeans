package inputdata;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
       String nama, alamat;
       int umur;
       
        System.out.print("Nama \t: ");
        nama = masukan.nextLine();
        System.out.print("Alamat \t: ");
        alamat = masukan.nextLine();
        System.out.print("Usia \t: ");
        umur = masukan.nextInt();
        System.out.println("===================");
        System.out.println(nama+" Lahir di "+alamat);
        System.out.println("Berumur "+umur+" th.");
    }
    
}
