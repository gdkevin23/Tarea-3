import java.util.Scanner;

public class UnoNumerosNaturales {

    public static void main(String[] args) {
        int i = 1;
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite el número máximo : ");
        int n = numero.nextInt();
        System.out.println("Los numeros naturales son : ");
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}


