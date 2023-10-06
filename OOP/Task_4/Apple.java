package OOP/Task_4;

/**
 * Яблоко
 */
public class Apple extends Fruit{
    public Apple() {
        super(1f);
    }

    @Override
    public String toString() {
        return "Вес яблока : " + this.getWeight();
    }
 
   
}
