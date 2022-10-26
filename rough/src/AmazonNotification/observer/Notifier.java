package AmazonNotification.observer;

public interface Notifier {

    void notifyUsers();

    void addUser(String s);

    void removeUser(String s);
}
