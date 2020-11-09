import java.util.Scanner;

public class SeisContarDigitos {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n = numero.nextInt();
        int count = 0;
        while (n != 0) {
            n /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }
}




