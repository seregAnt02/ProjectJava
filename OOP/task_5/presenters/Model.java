package OOP.task_5.presenters;

import OOP.task_5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);
    
    /**     
     * Действие клиента (пользователь нажал на кнопку отмены бронирования)
     * Отменить резерв столика, забронировать на другое время
     * @param oldReservation старый номер брони
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);


}
