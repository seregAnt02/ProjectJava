package OOP.lesson_1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfMilk getBottleOfMilk(String name, int volume) {
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume)
                    return bottleOfMilk;
            }
        }
        return null;
    }

    public Shokolad getShokoladKalorii(String name, int volume){

        for(Product product : products){
            if(product instanceof Shokolad){
                Shokolad shokolad = (Shokolad)product;
                if(shokolad.getName().equals(name) && shokolad.getKalorii() == volume){
                    return shokolad;
                }
            }
        }

        return null;
    }


}
