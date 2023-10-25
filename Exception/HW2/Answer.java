package Exception.HW2;

import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b){
      // Введите свое решение ниже
            if(a != null && b != null && a.length == b.length){                
            int[] arr = new int[a.length];
            for(int i = 0; i < a.length; i++){
                if(a[i] > 0 && b[i] > 0){            
                    arr[i] = a[i] > b[i] ? a[i] - b[i] : b[i] - a[i];
                }
                if(a[i] < 0 && b[i] < 0){        
                    arr[i] = a[i] < b[i] ? a[i] - b[i] : b[i] - a[i];                   
                }        
                if(a[i] > 0 && b[i] < 0){
                    arr[i] = b[i] + a[i];
                }
                if(a[i] < 0 && b[i] > 0){
                    arr[i] = a[i] + b[i];
                }
            }
            return arr;
        }      
       return new int[]{ 0 };
    }
}
