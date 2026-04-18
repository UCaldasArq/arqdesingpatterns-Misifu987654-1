package edu.ucaldas.creacionales.factory;

public class EmailFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
