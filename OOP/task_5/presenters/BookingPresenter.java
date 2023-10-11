package OOP.task_5.presenters;

import OOP.task_5.models.Table;
import OOP.task_5.models.TableModel;
import OOP.task_5.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private Model model;
    private View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setObserver(this);
    }

    /**
     * Получение списка всех столиков
     */
    private Collection<Table> loadTables(){
        return model.loadTables();
    }

    /**
     * Отобразить список столиков
     */
    public void updateUIShowTables(){
        view.showTables(loadTables());
    }

    /**
     * Отобразить результат бронирования на представлении
     * @param reservationId результат бронирования
     */
    private void updateUIShowReservationResult(int reservationId, int tableNo){
        view.showReservationTableResult(reservationId, tableNo);
    }

    /**
     * Произошло событие, пользователь нажал на кнопку резерва столика
     * @param orderDate дата резерва
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIShowReservationResult(reservationNo, tableNo);
        }
        catch (RuntimeException e){
            updateUIShowReservationResult(-1, -1);
        }
    }    

     /**          
     * Произошло событие, пользователь нажал на кнопку,
     * отменить резерв столика,
     * отобразить результат отмены бронирования столика.
     * @param oldReservation старый номер брони
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    @Override
    public void offReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {                        
        model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        view.showReservationCancel(oldReservation);        
    }
}
