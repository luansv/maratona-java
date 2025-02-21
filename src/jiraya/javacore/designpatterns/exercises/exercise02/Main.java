package jiraya.javacore.designpatterns.exercises.exercise02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a notification type (email, sms, push): ");
        String userInput = scanner.nextLine().toUpperCase();

        try {
        NotificationType notificationType = NotificationType.valueOf(userInput); // Convert string to enum
        Notification notification = NotificationFactory.getNotification(notificationType);
            System.out.println(notification.notifyUser());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid notification type entered!");
        }
        scanner.close();
    }
}
