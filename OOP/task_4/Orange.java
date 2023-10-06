package OOP.task_4;

/**
 * Апельсин
 */
public class Orange extends Fruit {
    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return "Вес апельсина : " + this.getWeight();
    }
}
