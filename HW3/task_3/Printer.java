package HW3.task_3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Printer {
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      

      System.out.println(Arrays.toString(arr));
      ans.analyzeNumbers(arr);      
    }    
}
class Answer {
        public void analyzeNumbers(Integer[] arr) {
          // Введите свое решение ниже    
          long start = System.currentTimeMillis();
          
          List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
          Collections.sort(list1);
          System.out.println(list1);

          //System.out.println("Minimum is " + Collections.min(list1));
          //System.out.println("Maximum is " + Collections.max(list1));

          int count = list1.size();
          int min = list1.get(0), max = list1.get(0);
          int sum = 0;
        
            for (int i = 0; i < list1.size(); i++) {
                if(list1.get(i) < min) min = list1.get(i);
                if(list1.get(i) > max) max = list1.get(i);
                sum += list1.get(i);
            }

          int avg = sum / count;
          System.out.println("Minimum is " + min);
          System.out.println("Maximum is " + max);
          System.out.println("Average is = " + avg);

          long finish = System.currentTimeMillis();
          long elapsed = finish - start;
          System.out.println("Прошло времени, мс: " + elapsed);

        }
    }
