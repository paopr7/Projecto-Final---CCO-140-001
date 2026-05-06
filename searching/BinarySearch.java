// Algorítmo Binary Search   
  public static int binarySearch(int[] arr, int target){
    int min = 0;
    int max = arr.length;
    int search;
    
        while (true){
            search = max - ((max - min) / 2); // Busca el elemento del medio
            
            if(Math.abs(max - min) == 1){ // Si solo quedan dos metodos
                    if(min == target){
                        return min;
                    }else if(max == target){
                        return max;
                    }else{
                        return -1;
                    } // fin de else
            } // fin de if externo
            
            if(arr[search] == target){ 
                return search;
            } // Fin de If
            
            if(target < arr[search]){ // Si la meta es menor
                max = search;
            }else if(target > arr[search]){ // Si la meta es mayor
                min = search;
            } // Fin de Else If
        } // Fin de While
  } // Fin de Algorítmo

