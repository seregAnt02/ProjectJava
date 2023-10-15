package OOPDmz.task_7.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private int maxSalary;

    private Publisher jobAgency;


    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    /**
     * Нужен сотрудник.
     */
    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

}
