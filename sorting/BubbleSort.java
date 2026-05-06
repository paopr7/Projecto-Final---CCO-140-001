// Pablo Pagán Rodríguez
// 600024638

/* Algorithm: 
    1. Comienzo
    2. Escribir el algorítmo Bubble Sort
    3. Determinar un array de 20 números random
    4. Imprimir el array unsorted
    5. Ejecutar Bubble Sort
    6. Imprimir sorted array
    7. Medir el tiempo que duró para sort el array e imprimirlo
    8. Fin
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
    // Algorítmo Bubble Sort
     public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    } // Fin del algorítmo
    
    // Método para imprimir el array
    public static void imprimirArray(int[] arr) {
        for (int i :  arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    } // Fin del programa ImprimirArray

    public static void main(String[] args) {
        int[] datos = {47,  12,  89,  3,  76,  55,  28,  91,  64,  7,  39,  100,  18,  83,  26,  60,  95,  41,  9,  72}; // Array de 20 números
        
        System.out.println("==== Bubble Sort Array ====\n");
        
        System.out.println("Unsorted Array:");
        imprimirArray(datos);

        // Calcula el tiempo del sort
        long start = System.nanoTime();
        BubbleSort(datos);
        long end = System.nanoTime();
        
        long duration = end - start;

        System.out.println("\nSorted Array:");
        imprimirArray(datos);
        
        System.out.println("\nAverage Bubble Sort time: " + duration + " nanoseconds");
    } // Fin del programa main
} // Fin de clase Main
