import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        double Area, PI, Raio;
        Scanner sc = new Scanner(System.in);

        PI = 3.14159;
        Raio = sc.nextDouble();
        Area = PI * Math.pow(Raio, 2);

        System.out.printf("A=%.4f", Area);
    }
}
