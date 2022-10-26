package AmazonNotification.observable;

import AmazonNotification.observer.Observer;


public interface StockObservable {
    public void setData(int count);
    public int getData();

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);
}
