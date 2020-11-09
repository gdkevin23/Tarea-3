import java.util.Scanner;

public class OncePrimosRango {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Digite el primer número del rango : ");
        int b = a.nextInt();
        System.out.print("Digite el último número del rango : ");
        int c = a.nextInt();
        System.out.println("Los números primos entre " + b + " y " + c + " son : ");
        int count;

        for (int i = b; i <= c; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(i);
        }

    }
}