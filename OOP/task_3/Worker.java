package OOP.task_3;

/**
 * Рабочий (фулл-тайм)
 */
public class Worker extends Employee {
    public Worker(String surName, String name, double salary, int employeeAge) {
        super(surName, name, salary, employeeAge);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Рабочий; Среднемесячная заработная плата (фиксированная): %.2f (руб.)",
                 surName , name, age, calculateSalary());
    }
}
