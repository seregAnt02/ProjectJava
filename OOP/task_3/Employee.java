package OOP.task_3;

/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Расчет среднемесячной заработной платы сотрудника
     * @return
     */     
    public abstract double calculateSalary();

    /**
      * Возраст сотрудника
      */
    protected int age;

    public Employee(String surName, String name, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Способы сортировки:
     * 1) Сортировка Comparable<Employee> - по умолчанию     
     */
    @Override
    public int compareTo(Employee o) {

        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
