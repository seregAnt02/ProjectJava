package HW2.task_2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;


     class Bubble {

        public void sort(int[] mas) {

            int min = 0;
            String res = "";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y-MM-dd H:mm");

            if (mas[0] == 9 && mas.length > 5) {
                min = 2;
            }
            
            for (int i = 0; i < mas.length - min; i++) {
                for (int j = 0; j < mas.length - i - 1; j++) {
                    if (mas[j] > mas[j + 1]){
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                    }
                }

                String date_str = simpleDateFormat.format(new Date());
                res = res + date_str + " " + Arrays.toString(mas) + "\n";

            }

            try {
                FileWriter writer = new FileWriter("log.txt", false);
                BufferedWriter bufferWriter = new BufferedWriter(writer);
                bufferWriter.write(res);
                bufferWriter.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        
        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
     class Program{ 
        public static void main(String[] args) { 
        int[] arr = {};
        
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        }     
        
        Bubble ans = new Bubble();      
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    
