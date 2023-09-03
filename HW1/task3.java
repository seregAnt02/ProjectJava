package HW1;

/**
 * task3
 * Реализовать простой калькулятор
 */

// import java.util.Scanner;

public class task3 {
    // // метод получения числа
    // static int scanNumber() {
    //     Scanner scan = new Scanner(System.in);
    //     int number = scan.nextInt();
    //     return number;
    //     // scan.close(); Почему не получается закрыть Scanner???
    // }

    // // метод получения числа операции
    // static String scanOperations() {
    //     Scanner scan = new Scanner(System.in);
    //     String operations = scan.nextLine();
    //     return operations;

    // }

    // метод получения результата
    public int getResult(char op, int a, int b) {
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;

            // default:
            //     System.out.println("Введите оператор: -, +, *, /");
            //     break;
        }
        return result;

    }

    public static void main(String[] args) {

        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '-';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println("итог: " + result);

        // System.out.println("Введите первое число: ");
        // int num1 = scanNumber();
        // System.out.println("Введите оператор: -, +, *, /");
        // String operations = scanOperations();
        // System.out.println("Введите второе число: ");
        // int num2 = scanNumber();
        // int result = getResult(operations, num1, num2);
        // System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

}
class Calculator {
    int calculate(char op, int a, int b) {
      // Введите свое решение ниже

        return new task3().getResult(op, a, b);
    }
}


// class Calculator {
//     public int calculate(char op, int a, int b) {
//       // Введите свое решение ниже
        
//       int result = 0;
//         switch (op) {
//             case '+':
//                 result = a + b;
//                 break;
//             case '-':
//                 result = a - b;
//                 break;
//             case '*':
//                 result = a * b;
//                 break;
//             case '/':
//                 result = a / b;

//         }
//         return result;

//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
//     public static void main(String[] args) { 
//         int a = 0;
//         char op = ' ';
//         int b = 0;

//         if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             a = 3;
//             op = '+';
//             b = 7;
//         } else {
//             a = Integer.parseInt(args[0]);
//             op = args[1].charAt(0);
//             b = Integer.parseInt(args[2]);
//         }

//         Calculator calculator = new Calculator();
//         int result = calculator.calculate(op, a, b);
//         System.out.println(result);
//     }
// }