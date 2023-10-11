package OOP.task_5.models;

import OOP.task_5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {


    private static int counter;

    private final int no;

    private final Collection<Reservation> reservations = new ArrayList<>();

    /**
     * Номер столика.
     * @return 
     * return int.
     */
    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }
    

    {
        no = ++counter;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }

}
