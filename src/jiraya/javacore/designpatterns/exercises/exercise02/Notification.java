package jiraya.javacore.designpatterns.exercises.exercise02;

public interface Notification {
    String notifyUser();
}

class EmailNotification implements Notification{

    @Override
    public String notifyUser() {
        return "Sending an Email Notification\"";
    }
}

class SMSNotification implements Notification{

    @Override
    public String notifyUser() {
        return "Sending an SMS Notification\"";
    }
}

class PushNotification implements Notification{
    @Override
    public String notifyUser() {
        return "Sending an Push Notification\"";
    }
}
