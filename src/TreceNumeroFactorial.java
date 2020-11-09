import java.util.Scanner;

public class TreceNumeroFactorial {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Digite un número: ");
        int n = a.nextInt();

        int num = n;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {

            factorial *= i;
        }
        System.out.printf("Factorial del número %d = %d", num, factorial);
    }
}

