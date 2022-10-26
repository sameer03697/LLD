package AmazonNotification.observer;

import java.util.ArrayList;
import java.util.List;
import AmazonNotification.observable.StockObservable;


public class EmailNotifier implements Notifier, Observer {
    List<String> users = new ArrayList<>();
    StockObservable stock;

    public EmailNotifier(StockObservable stockObservable) {
        stock = stockObservable;
    }

    @Override public void notifyUsers() {
        for (String user : users) {
            System.out.println(user);
        }
    }

    public void addUser(String s) {
        users.add(s);
    }

    public void removeUser(String s) {
        users.remove(s);
    }

    @Override public void update() {
        System.out.println(stock.getData());
        this.notifyUsers();
    }
}
