package OOP.task_4;

public abstract class Fruit {

    private final float weight;

    /**
     * Вес фрукта     
     */
     public float getWeight() {
        return this.weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}
