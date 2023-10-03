// Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.

// Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника. Формула расчета среднемесячной заработной платы может быть такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
// Переработать метод generateEmployees, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого). Метод должен быть один!
// Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
// Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.


package OOP.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program {

    private static Random random = new Random();    

    static Employee generateWorker(){        
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(120000);
        int age = random.nextInt(100);
        int day = random.nextInt(22) + 1;
        int bet = random.nextInt(9) + 1;         

        if(bet % 2 == 0){
            Freelancer freelancer = new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age);
            freelancer.setQuantityDays(day);
            freelancer.setBet(bet);        
            return freelancer;
        }   
        else{
            Employee worker = new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age);        
            return worker;
        }     
    }    

    /**
     * Возвращает некоторое кол-во
     *  сотрудников различных типов.
     * @param count
     * @return
     */
    static Employee[] generateEmployees(int count){
        Employee[] array = new Employee[count];
        for (int i = 0; i < array.length; i++)
            array[i] = generateWorker();
        return array;
    }

    public static void main(String[] args) {   

        Employee[] employees = generateEmployees(15);        

        Arrays.sort(employees, new SalaryComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new SalaryComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }
        
        System.out.println();

        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        for(Employee employee: employees){
            System.out.println(employee);
        }

    }

}
