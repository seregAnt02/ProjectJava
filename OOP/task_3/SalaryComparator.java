package OOP.task_3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    private SortType sortType;

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    /**
    * Сортировка по зарплате.
    */
    public SalaryComparator(SortType sortType) {
        this.sortType = sortType;
    }

     /**
     * Способы сортировки:     
     * 2) Comparator<Employee> - компаратор ввиде объекта.
     */
    @Override
    public int compare(Employee o1, Employee o2) {

        if (sortType == SortType.Ascending){
            return Double.compare(o1.calculateSalary(), o2.calculateSalary());
        }
        else {
            return Double.compare(o2.calculateSalary(), o1.calculateSalary());
        }

    }
}
