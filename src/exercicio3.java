import java.util.Scanner;

public class exercicio3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIFERENCA = A * B - C * D;
        sc.close();

        System.out.println("DIFERENÇA = " + DIFERENCA);
    }
}
