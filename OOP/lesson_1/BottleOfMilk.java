package OOP.lesson_1;

public class BottleOfMilk extends Product{

    private int volume; // объем
    private int fat; // Содержание жирности

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public BottleOfMilk(String brand, String name, double price, int volume, int fat) {
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;

    }

    @Override
    public String displayInfo() {
        return String.format("[МОЛОКО] %s - %s - %.2f - объем: %d; жирность: %d",
                brand, name, price, volume, fat);
    }
}
