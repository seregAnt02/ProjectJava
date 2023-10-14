package OOP.task_6;

import java.util.Scanner;


public class InputfromConsole{

     private Scanner scanner = new Scanner(System.in);    

     private Order order;

     public Order getOrder() {
        return order;
    }

    public InputfromConsole(){
        order = new Order();
     }     

     /**
     * Ввод ордера с консоли.
     */
    public void inputFromConsole(){
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Double.parseDouble(prompt("Цена: ")));
    }

    private String prompt(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
    
}
