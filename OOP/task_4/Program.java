package OOP.task_4;

import java.security.AllPermission;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект
        * */
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        // Orange orange1 = new Orange();
        // Orange orange2 = new Orange();
        
        Box<Apple> box1 = new Box<>(apple1.getWeight());     
        box1.add(apple1);        
        box1.add(apple2);
        //box1.add(orange1);

        for(Fruit item: box1.getFructs()){
            System.out.println("Вывод массива: " + item);
        }

        System.out.println("Размер массива: " + box1.getArraySize());
        System.out.println("Общий вес каробки: " + box1.getWeight());

        Box<Apple> box2 = new Box<>(apple1.getWeight());        
        box2.add(new Apple());
        box2.add(new Apple());

        //Box<Orange> box2 = new Box<>(apple1.getWeight());        
        // box2.add(orange1);        
        // box2.add(orange2);
        //box2.add(apple1);
        
        System.out.println("Размер массива: " + box2.getArraySize());
        System.out.println("Общий вес каробки: " + box2.getWeight());

        // сравним две коробки
        System.out.println("Результат работы метода compare() класса Box, параметры (пример: box1.compare(box2))");
        System.out.println("Массы коробок " + (box1.compare(box2) ? "одинаковы" : "различны") + ".");

        box1.shiftSingleItem(box2);        

        for(Fruit item : box2.getFructs()){
            System.out.println(item);
        }

        System.out.println("Сравниваем две коробки");
        System.out.println("Массы коробок " + (box1.compare(box2) ? "одинаковы" : "различны") + ".");
    }

}
