package ExceptionHW.HW4;

public class IsFloat {
    public static float isFloat(String input) {
        // Введите свое решение ниже        
        try{

            return Float.parseFloat(input);

        }catch(NumberFormatException e){
            System.out.println("Your input is not a float number. Please, try again.");
        }
        return Float.NaN;
    }
}
