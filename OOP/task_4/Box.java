package OOP.task_4;

import java.util.ArrayList;

import javax.swing.Box;

/**
 * Коробка
 */
public class Box<T extends Fruit> extends Fruit {

    ArrayList<T> fructs;

    public Box(float weight) {
        super(weight);        
        fructs = new ArrayList<>();
    }    

    /**
     * Фруктов в коробке
     * @return
     */
    public int getArraySize(){
        return fructs.size();
    }
    /**
     * метод добавляет в коробку один элемент
     * @param model
     */
    public void add(T model) {        
        fructs.add(0, model);
        System.out.println("Добавили в коробку элемент: " + model);  
    }

    /**
     * Метод создан для предоставления доступа к ArrayList продуктов которые кв коробке (для безопасности)     
     */
    public ArrayList<T> getFructs() {
        return fructs;
    }

    //метод возвращает общий вес коробки
    public float getWeight(){       
        float sumWeightProducts = 0.0f;
        for (Fruit e : fructs) {
            sumWeightProducts += e.getWeight();
        }
        return sumWeightProducts;
    }

    /**
     * метод сравнения двух коробок по весу
     * @param other
     * @return
     */
     public boolean compare(Fruit other) {
        // согласно условия результат работы данного метода true - если массы равны false - если не равны.
        return Math.abs(getWeight() - other.getWeight()) < 0.0001; // пример взят из урока для устранения неточности расчета
    }

    /**
     * метод позволяет перекладывать из коробки 1 в коробку 2 заданное количество элементов   
     * @param box2
     */
    public void shiftSingleItem(Box<T> box2) {        
        if (isProductsComparable(box2)) {
            System.out.print("Внимание! Смешивать товары запрещено, используйте другой товар или коробку!\r\n");
        }
        else{
            
            for (int i = fructs.size() - 1; i >= 0; i--) {            
            box2.getFructs().add(fructs.get(i));
            fructs.remove(i);            
            }

            System.out.println("Пересыпание прошло успешно : " + box2);
        }        
    }

    // метод который позволяет определить сопоставимы ли продукты по типу в коробке и вне ее.
    public boolean isProductsComparable(Box<T> otherBox) {
        return this.getClass() != otherBox.getClass();
    }
   
    @Override
    public String toString() {
        return "Масса коробки: " + this.getWeight();
    }
}
