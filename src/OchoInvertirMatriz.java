import java.util.*;
import java.util.stream.*;

public class OchoInvertirMatriz {
    public static void main(String[] args) {
        Integer[] invMatriz = {10, 20, 30, 40, 50};

        System.out.println("Matrix original:");
        for (int i = 0; i < invMatriz.length; i++)
            System.out.print(invMatriz[i] + "  ");

        System.out.println();

        System.out.println("Matriz invertida:");
        for (int i = invMatriz.length - 1; i >= 0; i--)
            System.out.print(invMatriz[i] + "  ");
    }
}