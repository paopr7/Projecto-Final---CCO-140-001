
/*
=======================================
Binary Search
Proyeto final CCO 140 001
Mayo 7 2026
Código hecho por Diego A. Bobea Santos
=======================================
*/

import java.util.*;
import java.io.*;
import java.lang.*;

public class Search {//comienzo de clase Search
   public static int binarySearch(int[] arr, int target) { //Comienza binarySearch
   //Ordenar el array primero para después hacer el search
   
   int[] sortedArr = arr.clone();
   Arrays.sort(sortedArr);
   
   System.out.println("Array original: " + Arrays.toString(arr));
   System.out.println("Array ordenado: " + Arrays.toString(sortedArr));
   System.out.println("Buscando: " + target);
   
   int left = 0;
   int right = sortedArr.length -1;
   int steps = 0;
   
   while (left <= right) {
       steps++;
       int mid = left + (right - left) /2;
       
       System.out.print("Paso " + steps + ": Buscando en indice medio " + mid + "(valor: " + sortedArr[mid] + ")");
       
       if(sortedArr[mid] == target){ 
           //Encontrar el valor, ahora buscar su posición en el array original
           int originalIndex = -1;
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] == target) {
                   originalIndex = i;
                   break;
               }
           }
           
                System.out.println("¡Objetivo Encontrado! El Objetivo " + target + " está en el índice " + originalIndex + " del array original.");
                System.out.println("En el array ordenado está en el índice " + mid + ".");
                System.out.println("Total de pasos: " + steps);
                System.out.println("===================");
                System.out.println();
                return originalIndex;
        }
   
        if (sortedArr[mid] < target){
        System.out.println("  Valor " + sortedArr[mid] + " es menor que " + target + " - buscando en mitad derecha");
                left = mid + 1;
            } else {
                System.out.println("  Valor " + sortedArr[mid] + " es mayor que " + target + " - buscando en mitad izquierda");
                right = mid - 1;
            }
   }
   
        System.out.println("[ERROR] El objetivo " + target + " no se encuentra en el array.");
        System.out.println("Total de pasos: " + steps);
        System.out.println("===================");
        System.out.println();
        return -1; 
   } //Binary search fin
   
   //Método main para imprimir los resultados
   
   public static void main(String[] args) { //main comienzo
        
        int[] data = {780, 30, 8, 1, 14, 23, 388, 56, 702, 109, 8, 23, 55, 78, 94, 5};
        
        System.out.println("=========================================================================");
        System.out.println("Array original: " + Arrays.toString(data));
        System.out.println("=========================================================================");
        System.out.println();
        System.out.println("===================");
        int index = binarySearch(data, 56);  // Buscar 56
        int index2 = binarySearch(data, 100); // Buscar 100 (no existe)
        
    } //main fin
} //fin de clase
