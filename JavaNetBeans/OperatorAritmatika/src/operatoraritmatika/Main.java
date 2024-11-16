package operatoraritmatika;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int a, b, c;
        System.out.print("Masukkan a = ");
        a = input. nextInt();
        System.out.print("Masukkan b : ");
        b = input.nextInt();
        c = a + b;
        System.out.print(a + " + " + b + " = ");
        System.out.println(c);
        c = b-a;
        System.out.println(b+ " - " + a + " = " + c);
        c = a * b;
        System.out.println(a+ " X " + b + " = " + c);
        c = b / a;
        System.out.println(b+ " : " + a + " = " + c);
        c = b % a;
        System.out.println(b+ " % " + a + " = " + c);

        
    }
    
}
