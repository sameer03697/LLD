package AmazonNotification;

import AmazonNotification.observable.IphoneStock;
import AmazonNotification.observable.StockObservable;
import AmazonNotification.observer.EmailNotifier;
import AmazonNotification.observer.Notifier;
import AmazonNotification.observer.SMSNotifier;


public class Test {
    public static void main(String[] args) {
        StockObservable iphoneStock = new IphoneStock();
        iphoneStock.setData(10);
        EmailNotifier emailNotifier = new EmailNotifier(iphoneStock);
        SMSNotifier smsNotifier = new SMSNotifier(iphoneStock);
        emailNotifier.addUser("Sam");
        smsNotifier.addUser("Sud");
        iphoneStock.addObserver(emailNotifier);
        iphoneStock.addObserver(smsNotifier);
        iphoneStock.setData(200);

        iphoneStock.removeObserver(emailNotifier);
        iphoneStock.setData(10);
    }
}
