// Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад -> калории) и включить в список продуктов в вендинг машину.
// Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре).
// Формат сдачи:
// Ссылка на github проект
// Подписать фамилию и номер группы

package OOP.lesson_1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        
      
        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 160, 2, 25);
      
        System.out.println(bottleOfMilk3.displayInfo());

        Product shokolad = new Shokolad("ООО Источник_новый", "Аленка", 123, 99);
        System.out.println(shokolad.displayInfo());


        ArrayList<Product> arrayList = new ArrayList<>();   
        arrayList.add(bottleOfMilk3);        
        arrayList.add(shokolad);

        VendingMachine vendingMachine = new VendingMachine(arrayList);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком (3)", 2);
        if (bottleOfMilk != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }

        Shokolad  shokoladKalorii = vendingMachine.getShokoladKalorii("Аленка", 99);
        if (shokoladKalorii != null){
            System.out.println("Вы купили:");
            System.out.println(shokoladKalorii.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки с такими калориями нет в автомате.");
        }

    }

}
