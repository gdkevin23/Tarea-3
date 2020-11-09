import java.util.Scanner;

public class CuatroTablaMultiplicar {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n = numero.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}


