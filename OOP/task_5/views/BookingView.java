package OOP.task_5.views;

import OOP.task_5.models.Table;
import OOP.task_5.presenters.View;
import OOP.task_5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationId, int tableNo) {
        if (reservationId > 0){
            System.out.printf("Столик #" + tableNo + " успешно забронирован. Номер вашей брони: #%d\n", reservationId);
        }
        else {
            System.out.println("Не удалось забронировать столик. Попробуйте повторить операцию позже.");
        }
    }

    public void showReservationCancel(int reservationId){
        System.out.println(String.format("Бронирование #%d успешно отменено.", reservationId));
    }
    
    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**     
     * Действие клиента (пользователь нажал на кнопку отмены бронирования)
     * Отменить резерв столика
     * @param oldReservation старый номер брони
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){        
        observer.offReservationTable(oldReservation, reservationDate, tableNo, name);
    }

}
