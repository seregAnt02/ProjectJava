package OOP.task_5;

import OOP.task_5.models.TableModel;
import OOP.task_5.presenters.BookingPresenter;
import OOP.task_5.presenters.Model;
import OOP.task_5.presenters.View;
import OOP.task_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowTables();
        bookingView.reservationTable(new Date(), 2, "Станислав");

        bookingView.changeReservationTable(1001, new Date(), 2, "Станислав");   
        
        bookingView.reservationTable(new Date(), 3, "Станислав");        

    }

}
