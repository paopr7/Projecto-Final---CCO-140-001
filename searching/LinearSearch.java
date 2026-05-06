// Algorítmo Linear Search    
  public static int linearSearch(int[] arr, int target){
    int index  = 0;
      for(int i = 0; i < arr.length ; i++){
          if(arr[i] == target){
              index = i;
              break;
        }else if(i == arr.length - 1 && arr[i] != target){
            return -1;
        } 
      } 
      return index;
  } // Fin de Algorítmo
