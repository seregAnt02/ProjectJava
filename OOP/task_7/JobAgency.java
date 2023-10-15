package OOPtask_7.lesson7.observer;

import java.util.ArrayList;
import java.util.List;

//import OOPDmz.task_7.lesson7.observer.Observer;

public class JobAgency implements Publisher {


    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, int salary) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
