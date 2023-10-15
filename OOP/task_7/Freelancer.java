package OOP.task_7.lesson7.observer;

/**
 * model Freelancer.
 */
public class Freelancer implements Observer{
    
    private String name;
    private int salary = 60000;

    public Freelancer(String name){
        this.name = name;
    }
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Фрилансер %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);                         
        }
        else {
            System.out.printf("Фрилансер %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
    
    
}
