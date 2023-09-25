package OOP.lesson_1;

public class Shokolad extends Product {    
    private Integer kalorii;

    

    public Shokolad(String brand, String name, double price, Integer kalorii) {
        super(brand, name, price);
        this.kalorii = kalorii;
    }

    public Integer getKalorii(){
        return this.kalorii;
    }

    public Integer setKalorii(Integer kalorii){
        return this.kalorii = kalorii;
    }       
    
    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f - калорий: %d",
                brand, name, price, kalorii);
    }
}
