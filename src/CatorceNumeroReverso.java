import java.util.Scanner;

public class CatorceNumeroReverso {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite un número: ");
        int n = numero.nextInt();

        int b = 0;

        while (n != 0) {
            int a = n % 10;
            b = b * 10 + a;
            n /= 10;
        }
        System.out.println("Reversed Number: " + b);
    }
}



