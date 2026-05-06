// Pablo Pagán Rodríguez
// 600024638
// Escuela de Salud y Ciencias, Universidad Sagrado Corazón
// CCO 140 001 PROGRAMACION ORIENTADA A OBJETOS
// Prof. Antonio Vantaggiato 
// 7 de mayo de 2026

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
     public static void sort(int[] arr) {
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
    } // Fin de programa
    
    // Método para imprimir el array
    public static void imprimirArreglo(int[] arreglo) {
        for (int i :  arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] datos = {47,  12,  89,  3,  76,  55,  28,  91,  64,  7,  39,  100,  18,  83,  26,  60,  95,  41,  9,  72}; // Array de 20 números
        
        System.out.println("==== Bubble Sort Array ====\n");
        
        System.out.println("Unsorted Array:");
        imprimirArreglo(datos);

        // Calcula el tiempo del sort
        long start = System.nanoTime();
        sort(datos);
        long end = System.nanoTime();
        
        long duration = end - start;

        System.out.println("\nSorted Array:");
        imprimirArreglo(datos);
        
        System.out.println("\nAverage Bubble Sort time: " + duration + " nanoseconds");
    }
}
