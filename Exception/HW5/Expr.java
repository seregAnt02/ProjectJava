package Exception.HW5;

import java.util.Arrays;

class Expr {

    public static double expr(int[] intArray, int d) {
 // Введите свое решение ниже
        try{            
            double sum = intArray[8] / d;      
            System.out.println(String.format("intArray[8] / d = %d / 1 = %s", (int)sum, sum));
                    return sum;
            
        }
        catch(ArithmeticException e){            
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");        
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
        }
        return Double.NaN;
    }
}
