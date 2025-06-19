import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1, val2, soma;

        val1 = sc.nextInt();
        val2 = sc.nextInt();

        soma = (val1 + val2);

        System.out.println("SOMA = " + soma);

    }
}