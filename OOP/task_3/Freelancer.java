package OOP.task_3;

/** 
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {
    
    
    private int bet;
    
    /**
     * 
     * Почасовая ставка
     */
    public void setBet(int bet) {
        this.bet = bet;
    }

    private int numberDays;


    /**
     * Количество дней
     */
    public void setQuantityDays(int numberDays) {
        this.numberDays = numberDays;
    }


    public Freelancer(String surName, String name, double salary, int employeeAge) {
        super(surName, name, salary, employeeAge);                        
    }
    

    @Override
    public double calculateSalary() {        
        // 20.8 * 8 * почасовая ставка
        return this.numberDays * 8 * this.bet;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Фрилансер; Среднемесячная заработная плата (почасовая ставка): %.2f (руб.)", 
        surName , name, age, calculateSalary());
    }    
}
