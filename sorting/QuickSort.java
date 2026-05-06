// Pablo Pagán Rodríguez
// 600024638

/* Algorithm: 
    1. Comienzo
    2. Escribir el algorítmo Quick Sort
    3. Determinar un array de 20 números random
    4. Imprimir el array unsorted
    5. Ejecutar Quick Sort
    6. Imprimir sorted array
    7. Medir el tiempo que duró para sort el array e imprimirlo
    8. Fin
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
    // Algorítmo Quick Sort
     public static void QuickSort(int[] arr) {
        if (arr != null && arr.length > 1) {
            quickSort(arr, 0, arr.length - 1);
        }
    }
    
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    } // Fin del algorítmo QuickSort
    
    // Método para imprimir el array
    public static void imprimirArray(int[] arr) {
        for (int i :  arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    } // Fin del programa ImprimirArray

    public static void main(String[] args) {
        int[] datos = {34, 6, 88, 15, 70, 52, 97, 23, 81, 44, 2, 67, 90, 11, 59, 78, 36, 99, 25, 63}; // Array de 20 números
        
        System.out.println("==== Quick Sort Array ====\n");
        
        System.out.println("Unsorted Array:");
        imprimirArray(datos);

        // Calcula el tiempo del sort
        long start = System.nanoTime();
        QuickSort(datos);
        long end = System.nanoTime();
        
        long duration = end - start;

        System.out.println("\nSorted Array:");
        imprimirArray(datos);
        
        System.out.println("\nAverage Quick Sort time: " + duration + " nanoseconds");
    } // Fin del programa main
} // Fin de clase Main
