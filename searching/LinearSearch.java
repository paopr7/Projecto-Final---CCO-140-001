/*
=======================================
Linear Search
Proyeto final CCO 140 001
Mayo 7 2026
Código hecho por Diego A. Bobea Santos
=======================================
*/

import java.util.*;
import java.io.*;
import java.lang.*;

public class Search {//comienzo de clase Search
   public static int linearSearch(int[] arr, int target) { //Comienza linear search
        int steps = 0;
        System.out.println("Buscando: " + target);
        
        
        
        for (int i = 0; i < arr.length; i++) {
            steps++;
            
            //imprime el resultado si se encuentra el índice
            if (arr[i] == target) {
                System.out.println("¡Objetivo Encontrado! El Objetivo " + target + " está en el índice " + i + ".");
                System.out.println("Total de pasos: " + steps);
                System.out.println("===================");
                System.out.println();
                System.out.println("===================");
                return i;
            }
            
        }
        //Imprime el error del search si no se encuentra el índice
        System.out.println("[ERROR] El objetivo " + target + " no se encuentra en el array.");
        System.out.println("Total de pasos: " + steps);
        System.out.println("===================");
        System.out.println();
        return -1; 
   } //Linear search fin
   
   //Método main para imprimir los resultados
   public static void main(String[] args) { //main comienzo
        
        int[] data = {780, 30, 8, 1, 14, 23, 388, 56, 702, 109, 8, 23, 55, 78, 94, 5};
        
        System.out.println("=========================================================================");
        System.out.println("Array: " + Arrays.toString(data));
        System.out.println("=========================================================================");
        System.out.println();
        System.out.println("===================");
        int index = linearSearch(data, 56);//indice 6
        int index2 = linearSearch(data, 100);//indice -1 (error que no se pudo encontrar el indice)
        

    } //main fin
} //fin de clase
