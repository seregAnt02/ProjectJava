package OOP.task_3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    private SortType sortType;

    /**
    * Сортировка по возрасту человека.
    */
    public AgeComparator(SortType sortType) {
        this.sortType = sortType;
    }

    public SortType getSortType() {
        return sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (sortType == SortType.Ascending){
            return Double.compare(o1.age, o2.age);
        }
        else {
            return Double.compare(o2.age, o1.age);
        }
    }
}
