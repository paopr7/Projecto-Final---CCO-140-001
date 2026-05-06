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

## ═══════ RESULTADOS/OBSERVACIONES ═══════

### Ordenamiento
| Algoritmo    | ¿Fácil de Entender? | ¿Efectivo para data grande? | ¿Necesita memoria extra? |
|---------------|------------------------|---------------------|---------------------|
| Bubble Sort   | Sí        | No       | No |
| Insertion Sort| [PLACEHOLDER]          | [PLACEHOLDER]       | [PLACEHOLDER] |
| Merge Sort    | [PLACEHOLDER]          | [PLACEHOLDER]       | [PLACEHOLDER] |
| Quick Sort    | Moderadamente difícil          | Muy eficiente       | No, usualmente no lo afecta |
| Search Sort   | [PLACEHOLDER]          | [PLACEHOLDER]       | [PLACEHOLDER] |



## ═══════ REFLEXIÓN ═══════
