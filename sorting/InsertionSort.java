import java.util.*;
import java.lang.*;
import java.io.*;

public class InsertionSort {
    
    public static void ordenar(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; ++i) {
            int llave = arreglo[i];
            int j = i - 1;

            // Mover los elementos que son mayores que la llave a una posición adelante
            while (j >= 0 && arreglo[j] > llave) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = llave;
        }
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] datos = {12, 11, 13, 5, 6};

        System.out.println("-----------------");
        System.out.println("Arreglo original:");
        System.out.println("-----------------");
        imprimirArreglo(datos);

        System.out.println();
        
        ordenar(datos);
        System.out.println("-----------------");
        System.out.println("Arreglo ordenado:");
        System.out.println("-----------------");
        imprimirArreglo(datos);
    }
}
