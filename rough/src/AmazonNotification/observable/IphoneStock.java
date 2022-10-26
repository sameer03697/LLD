package AmazonNotification.observable;

import java.util.ArrayList;
import java.util.List;
import AmazonNotification.observer.Observer;


public class IphoneStock implements StockObservable {
    int stock;
    List<Observer> observers = new ArrayList<>();

    @Override public void setData(final int count) {
        stock = count;
        for (Observer ob :
                observers) {
            ob.update();
        }
    }

    @Override public int getData() {
        return stock;
    }

    @Override public void addObserver(final Observer observer) {
        observers.add(observer);
    }

    @Override public void removeObserver(final Observer observer) {
        observers.remove(observer);

    }
}
