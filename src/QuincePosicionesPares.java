public class QuincePosicionesPares {

    public static void main(String[] args) {

        int[] matriz = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Los números que se encuentran en las posiciones pares de la matriz dada son: ");

        for (int i = 1; i < matriz.length; i = i + 2) {
            System.out.println(matriz[i]);
        }
    }
}

