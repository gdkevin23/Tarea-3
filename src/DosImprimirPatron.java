public class DosImprimirPatron {

    public static void main(String args[]) {
        int i, j, numero, n = 5;
        for (i = 0; i < n; i++) {
            numero = 1;
            for (j = 0; j <= i; j++) {

                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }
    }
}