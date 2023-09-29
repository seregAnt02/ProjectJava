package OOP.lesson_2;

// Чтобы можно было хранить еду, создадим класс Тарелка с полем food (еда измеряется в целых
// числах и не важно, что это за единицы измерения). При создании тарелки мы можем указать
// начальное значение food. В процессе работы с помощью метода info() можно вывести в консоль
// информацию о тарелке.

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public Integer getFood(){
        return this.food;
    }
    public Integer setFood(int inFood){                                
            return this.food = inFood;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addPlate(int volume){
        this.food += volume;
    }
}
