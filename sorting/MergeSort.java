/*
=======================================
Merge Sort
Proyecto final CCO 140 001
Mayo 7 2026
Codigo hecho por Diego A. Bobea Santos
=======================================
*/

import java.util.*;
import java.io.*;
import java.lang.*;

public class Merge {//comienzo de clase Merge
    public static void merge(int[] arr,  int left,  int mid,  int right) {
        int n1 = mid - left + 1; 
        int n2 = right - mid;
        
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        
        for (int i = 0; i < n1; i ++) {
            leftArray[i] = arr[left + i];
            
        }
        
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        
        int i = 0,  j = 0;
        
        
        int k = left;
        
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
               i++;
           } else {
               arr[k] = rightArray[j];
               j++;
           }
           k++;
           }
           
            while (i < n1) {
           arr[k] = leftArray[i];
           i++;
           k++;
       }
        
         while (j < n2) {
           arr[k] = rightArray[j];
           j++;
           k++;
       }
        }
    
    public static void mergeSort(int[] arr,  int left,  int right) {
       if (left < right) {
           // Encontrar el punto medio
           int mid = left + (right - left) / 2;
           
           // Ordenar la primera mitad
           mergeSort(arr,  left,  mid);
           
           // Ordenar la segunda mitad
           mergeSort(arr,  mid + 1,  right);
           
           // Mezclar las dos mitades ordenadas
           merge(arr,  left,  mid,  right);
           
           // Mostrar el estado del array despus de cada merge
           System.out.println("Despues de mezclar indices " + left + " a " + right + ": " + 
                              Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
           System.out.println();
       }
   }
   
    // Metodo para iniciar el merge sort
   public static void performMergeSort(int[] arr,  String sortName) {
       System.out.println(sortName + " iniciado...");
       System.out.println();
       
       int[] arrCopy = arr.clone(); // Trabajamos con una copia para no modificar el original
       mergeSort(arrCopy,  0,  arrCopy.length - 1);
       
       System.out.println("=========================================================================");
       System.out.println(sortName + " completado!");
       System.out.println("Array ordenado:  " + Arrays.toString(arrCopy));
       System.out.println("=========================================================================");
       System.out.println();
   }
    // Metodo main para imprimir los resultados
   public static void main(String[] args) { //main comienzo
        
        int[] data = {5,  4,  6,  3,  18,  2,  9,  1,  7};
        
        System.out.println("=========================================================================");
        System.out.println("Array:  " + Arrays.toString(data));
        System.out.println("=========================================================================");
        System.out.println();
        
        performMergeSort(data,  "Merge Sort");
        


    } //main fin
} //fin de clase
