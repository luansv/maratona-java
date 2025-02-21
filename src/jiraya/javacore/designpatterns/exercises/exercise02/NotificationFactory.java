package jiraya.javacore.designpatterns.exercises.exercise02;

public class NotificationFactory {
    public static Notification getNotification(NotificationType notificationType){

        switch (notificationType){
            case SMS: return new SMSNotification();
            case EMAIL: return new EmailNotification();
            case PUSH: return new PushNotification();

            default: throw new IllegalArgumentException("Notification type not found!");
        }
    }
}
