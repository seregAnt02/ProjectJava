// Реализуйте структуру телефонной книги с помощью Map, учитывая, что 1 человек может иметь несколько телефонов и у человека уникальное имя.
//  Поработать с методами Map. Отсортировать Map в обратном порядке.

package HW5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {
    private static Map<String, ArrayList<String>> phoneNote = new LinkedHashMap<>();


    public static void main(String[] args) {
        fill();
        System.out.println(phoneNote);
        sort();
        System.out.println(phoneNote);
    }

    private static void fill(){
        phoneNote.put("Ivanov", new ArrayList<>());
        phoneNote.put("Petrov", new ArrayList<>());
        phoneNote.put("Sidorov", new ArrayList<>());

        addPhone("Ivanov", "000");
        addPhone("Petrov", "111");
        addPhone("Petrov", "222");
        addPhone("Sidorov", "111");
        addPhone("Sidorov", "444");
        addPhone("Sidorov", "555");
    }

    private static void addPhone(String name, String phone){
        phoneNote.get(name).add(phone);
    }

    private static void sort(){
        phoneNote = phoneNote.entrySet()
        .stream()
        .sorted(new PBComparator())
        .collect(Collectors.toMap(
            Map.Entry:: getKey,
            Map.Entry:: getValue,
            (a, b) -> {
                throw new AssertionError();
            },
            LinkedHashMap:: new
        ));
    }
}
