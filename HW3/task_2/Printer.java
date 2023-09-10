package HW3.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Printer {
     public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      System.out.print(Arrays.toString(arr) + "\r\n");
      ans.removeEvenNumbers(arr);      
    }
}
class Answer {
    public void removeEvenNumbers(Integer[] arr) {
      // Введите свое решение ниже
      List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

      for(int i = 0; i < list.size(); i++){
        if(list.get(i) % 2 == 0) {
            list.remove(i);        
            i--;
        }        
      }
      System.out.print(list);
    }
}
