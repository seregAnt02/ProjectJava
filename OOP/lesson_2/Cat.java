package OOP.lesson_2;

// Допустим, в программе есть класс Кот. У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём
// пищи). Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет
// кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду:

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;    

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    // public Boolean getIsSatiety(){
    //     return this.satiety;
    // }
    public Boolean setSatiety(Boolean flag){
        return this.satiety = flag;
    }
    public Integer getAppetite(){
        return this.appetite;
    }
    public String getName() {
        return this.name;
    }
    public void eat(String name, Boolean satiety) {

        System.out.println(String.format("Имя: %s ссытость: %b", name, satiety));     }
}
