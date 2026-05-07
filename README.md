# Projecto Final - CCO 140 001
### Hecho Por:
- Rodrigo A. Tejeda Pichardo
- Diego A. Bobea Santos
- Pablo A. Pagán Rodriguez
- Axel E. Ortiz Paulino

## ═══════ DESCRIPCIÓN ═══════
  En este repositorio, encontramos varios algoritmos de _ordenamiento_ y _búsqueda_ repasados en clase. 
  
 &ensp; **Cada algoritmo contiene:** 
  - Código de ejemplo
  - Descripción breve de cómo funciona

### Programas Incluidos 
* 🔁 Ordenamiento 
  * Bubble Sort
  * Insertion Sort
  * Merge Sort
  * Quick Sort
  * Search Sort
    
* 🔎 Búsqueda 
  * Linear Search 
  * Binary Search

* 💻 Programación Basada en Objetos (OOP) 

## ═══════ ALGORITMOS ═══════
### Ordenamiento 
﹌﹌﹌﹌﹌﹌﹌

#### Bubble Sort 🫧:
 ``` java
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
  ``` 
* Descripción:
  * El más simple de todos los algoritmos de ordenamiento. Es fácil de entender y no requiere memoria extra.
  
* ¿Cómo Funciona?:
   * Revisa cada elemento de un arreglo, comparándolo con el que le sigue en la secuencia. Si el elemento es mayor que el que le sigue, se invierte su orden.
   * Al final de cada ciclo, el elemento **mas** grande estará en su posición correcta.
  
* Ventajas:
  * Fácil de leer
  * Tiene una lógica simple
  
* Desventajas:
  * No es eficiente ordenando data grande.
  * El algoritmo de ordenamiento más lento.

<hr>
 
#### Insertion Sort 📩:
``` java
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
```
* Descripción:
  * Es un algoritmo de ordenamiento simple que construye una lista final ordenada elemento por elemento, comparando cada nueva entrada con las anteriores ya organizadas.
  
* ¿Cómo Funciona?:
   * Funciona dividiendo la lista en una parte "ordenada" y otra "desordenada"; toma un elemento de la parte desordenada y lo desplaza hacia atrás en la parte ordenada hasta encontrar su lugar exacto.
  
* Ventajas:
  * Es extremadamente eficiente para listas pequeñas o datos que ya están mayormente ordenados.
  * Es un algoritmo in-place (requiere memoria mínima adicional) y estable (mantiene el orden relativo de elementos iguales).
  
* Desventajas:
  * Al ser un proceso de uno en uno, el tiempo de espera se vuelve excesivo y poco práctico cuando la cantidad de datos aumenta.
  * Si los elementos pequeños están al final, el algoritmo debe desplazar manualmente casi toda la lista para acomodarlos, desperdiciando mucho esfuerzo.

<hr>

#### Merge Sort 🔀:
``` java
            [Código Aquí]
```
* Descripción:
  * [Aquí]
  
* ¿Cómo Funciona?:
   * [Aquí]
  
* Ventajas:
  * [Aquí]
  
* Desventajas:
  * [Aquí]

<hr>


  
#### Quick Sort ⚡:
  ``` java
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
```

* Descripción:
  * Es un algoritmo rápido, basado en la estrategia de "divide y vercerás".
  
* ¿Cómo Funciona?:
   * Este algortimo elige un elemento del array, convirtiendolo en **pivote**.
   * Luego, pone los elementos más pequeños a la **isquierda** del pivote y más grandes a la **derecha** el pivote.
   * Usando **recursión**, repite este proceso con las partes divididas del array, eligiendo un nuevo pivote cada vez hasta quedar ordenado 
  
* Ventajas:
  * Uno de los algoritmos de ordenamiento más rápidos.
  * No usa memoria extra, solo recursión.
  
* Desventajas:
  * Cómplicado, y no es fácil de leer.
  * Aunque es rápido, su rapidez varía mucho dependiendo de los pivotes que elija el algoritmo.

<hr>
  
#### Search Sort 🔎:
``` java
            [Código Aquí]
```
* Descripción:
  * [Aquí]
  
* ¿Cómo Funciona?:
   * [Aquí]
  
* Ventajas:
  * [Aquí]
  
* Desventajas:
  * [Aquí]

<hr>









### Búsqueda
﹌﹌﹌﹌﹌﹌﹌
#### Linear Search 🔢:
``` java
            [Código Aquí]
```

* Descripción:
  * El más simple de los algoritmos de búsqueda. Fácil de entender e implementar.
  
* ¿Cómo Funciona?:
   * Chequea cada elemento del array, uno por uno, hasta encontrar el elemento deseado. 
  
* Ventajas:
  * Extremadamente simple
  * Fácil de entender y leer
  * Funciona con cualquier array
  
* Desventajas:
  * Muy lento con data grande

<hr>

#### Binary Search 🌗:
``` java
            [Código Aquí]
```

* Descripción:
  * Un algoritmo de busqueda que se especializa en buscar dentro de arrays grandes. Requiere que el array esté ordenado.
  
* ¿Cómo Funciona?:
   * Este algortimo toma y revisa el elemento del medio del array.
   * Luego, dependiendo de si el blanco es mayor o menor que el elemento medio, elimina una mitad del array.
   * Luego, repite este proceso hasa encontrar el blanco, cortando el array por la mitad con cada ciclo.
  
* Ventajas:
  * Perfecto para buscar dentro de arrays grandes
  * Fácil de entender
  
* Desventajas:
  * Requiere un array ordenado.

          
## ═══════ EXPLICACIONES SIMPLES ═══════
### Bubble Sort:
 * 1. Bubble sort compara cada número de un array en orden de izquierda a derecha.
 * 2. Si el número de la izquierda es más grande que el de la derecha, se intercambian; si no, pues sigue al siguiente número.
 * 3. Continua este loop hasta que todos los datos estén ordenados.

  * Example:
  * {1, 3, 2}
    * 1. Compara 1 con 3: Como 1 < 3, 1 se queda donde está.
    * 2. Compara 3 con 2: Como 3 < 2, 3 se cambia a la posición de 2.
  * Array Final: {1, 2, 3}

### Quick Sort:
 * 1. Quick Sort determina un número pivot en el array y examina los números que son mayor y menor que él.
 * 2. Los números menores del pivot se hechan a la izquierda y los mayores se hechan a la derecha.
 * 3. Se repite el proceso con un nuevo pivot.

  * Example:
  * {5, 2, 7, 1, 4}
  * Pivot: 5
  * Smaller than 5: {2, 1, 4}; bigger than 5: {7}
  * New pivot: 5
  * Smaller than 2: {1}; bigger than 2: {4}
  * - It organizes the array to: {1, 2, 4, 5, 7}
## ═══════ RESULTADOS/OBSERVACIONES ═══════

### Ordenamiento
| Algoritmo    | ¿Fácil de Entender? | ¿Efectivo para data grande? | ¿Necesita memoria extra? |
|---------------|------------------------|---------------------|---------------------|
| Bubble Sort   | Sí        | No       | No |
| Insertion Sort| Si        | No       | No    |
| Merge Sort    | [PLACEHOLDER]          | [PLACEHOLDER]       | [PLACEHOLDER] |
| Quick Sort    | Moderadamente difícil          | Muy eficiente       | No, usualmente no lo afecta |
| Search Sort   | [PLACEHOLDER]          | [PLACEHOLDER]       | [PLACEHOLDER] |



## ═══════ REFLEXIÓN ═══════
