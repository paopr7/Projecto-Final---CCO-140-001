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
public class Merge {
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
   
```
* Descripción:
  * Merge Sort es un algoritmo de ordenamiento estable y eficiente y basado en el paradigma de "dividir y vencerás".
  
* ¿Cómo Funciona?:
   * Este sort funciona dividiendo recursivamente una lista desordenada en un sublistas hasta llegar a solamente elementos para despues fusionarlas (merge) las sublistas para despues ordenarlas.
  
* Ventajas:
  * Es recursiva
  * Es estable, mantiene el orden relativo de los elementos con claves iguales
  * Eficiencia consistente, ofrece un tiempo de ejecución, en los mejores, peores y promedios de los casos.
  
* Desventajas:
  * Uso de memoria adicional
  * No es eficiente en conjuntos pequeños

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
  
### Búsqueda
﹌﹌﹌﹌﹌﹌﹌
#### Linear Search 🔢:
``` java
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
### Bubble Sort 🫧:
   1. Bubble sort compara cada número de un array en orden de izquierda a derecha.
   2. Si el número de la izquierda es más grande que el de la derecha, se intercambian; si no, pues sigue al siguiente número.
   3. Continua este loop hasta que todos los datos estén ordenados.

* Example:
  * {1, 3, 2}
    * Compara 1 con 3: Como 1 < 3, 1 se queda donde está.
    * Compara 3 con 2: Como 3 < 2, 3 se cambia a la posición de 2.
  * Array Final: {1, 2, 3}

### Insertion Sort 📩:
1. La primera persona de la fila se queda donde está (porque una sola persona ya está "ordenada").
2. sacas a la siguiente persona de la fila y la comparas con los que ya están organizados.
3. Esa persona va caminando hacia atrás en la fila hasta que encuentra a alguien más bajito que ella; ahí se mete en el medio.

 *Example:
  * {6, 3, 1, 4, }
  * Paso 1: El 6 es el primero, se queda quieto.
  * Paso 2: Sacas al 3. Como el 3 es más pequeño que el 6, el 6 se mueve un paso a la derecha y el 3 se pone al frente.
  * Fila: [3, 6], 1, 4
  * Paso 3: Sacas al 1. El 1 es más pequeño que el 6 y que el 3, así que camina hasta el puro principio de la fila.
  * Fila: [1, 3, 6], 4
  * Paso 4: Sacas al 4. El 4 es más pequeño que el 6, pero más grande que el 3. Se mete justo entre ellos dos.
  * Fila final: [1, 3, 4, 6]
 
### Merge Sort 🔀: 
1. Merge Sort divide el array en listas pequeñas para que sea más fácil de resolver.
2. Combina o mezcla las listas pequeñas hasta que se ordene la lista original.
3. Se crea la lista ordenada a base del procedimiento.

 *Example:
  * {6, 3, 1, 4, }
  * Dividir por la mitad primero: [6, 3] y [1, 4]
  * Dividir otra vez hasta tener los elementos individuales: [6] [3] [4] [1]
  * Ahora mezclar el [6] con el [3] y combinarlos de menor a mayor. [3, 6]
  * Hacer lo mismo con el [1] y el [4] = [1, 4]
  * Finalmente, combinar las dos listas: [1, 3, 4, 6]
  * Lista finalmente ordenada: [1, 3, 4, 6]

### Quick Sort ⚡:
   1. Quick Sort determina un número pivot en el array y examina los números que son mayor y menor que él.
   2. Los números menores del pivot se hechan a la izquierda y los mayores se hechan a la derecha.
   3. Se repite el proceso con un nuevo pivot.

* Example:
  * {5, 2, 7, 1, 4}
    * Pivot: 5
    * Smaller than 5: {2, 1, 4}; bigger than 5: {7}
    * New pivot: 5
    * Smaller than 2: {1}; bigger than 2: {4}
  * It organizes the array to: {1, 2, 4, 5, 7}


## ═══════ RESULTADOS/OBSERVACIONES ═══════

### Ordenamiento y Búsqueda
| Algoritmo     | ¿Fácil de Entender?    | ¿Efectivo para data grande? | ¿Necesita memoria extra?   |
|---------------|------------------------|-----------------------------|--------------------------  |
| Bubble Sort   | Sí                     | No                          | No                         |
| Insertion Sort| Si                     | No                          | No                         |
| Merge Sort    | No                     | Sí                          | Sí                         |
| Quick Sort    | Moderadamente difícil  | Muy eficiente               | No, usualmente no lo afecta|
| Linear Search | Sí                     | No                          | No                         |
| Binary Search | Sí                     | Sí                          | No                         |


## ═══════ REFLEXIÓN ═══════
### Durante el transcurso de este curso, aprendimos mucho sobre distintos temas fundamentales de la programación. Aunque a veces nos hayamos quedado atascados en algunas partes, siempre aprendemos y nos adaptamos. Aprendimos materas como OOP, polimorfismo y como archivar, que nos dejan organizar diferentes datos fácilmente. Incluso aprendimos sobre los arrays y como organizarlos o buscar datos en ellos. Ahora, ya preparados, podemos llevar estos métodos al próximo curso con confianza en nuestras habilidades.
