package OOP.task_7.lesson7.observer;

public interface Publisher {

    void sendOffer(String companyName, int salary);

    /**
     * Регистрация вакансий.
     * @param observer
     */
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
