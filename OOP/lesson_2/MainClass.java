
// Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
// Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
// Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
// Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

package OOP.lesson_2;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        
        Cat cat = new Cat("cat", 5);
        Cat cat1 = new Cat("cat1", 30);
        Cat cat2 = new Cat("cat2", 40);
        Plate plate = new Plate(71);

        plate.addPlate(3);        

        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);

        plate.info();        
        System.out.println("---------------------");
        
        ForIsEat(cats, plate);
    }
    private static void ForIsEat(List<Cat> cats, Plate plate){
        for(Cat item : cats){            
            int remainsFood = plate.getFood() - item.getAppetite();
            if(remainsFood >= 0){                                     
                item.eat(item.getName(),item.setSatiety(true));                            
                plate.setFood(remainsFood);
            }
        }        
    }
}
