package edu.ucaldas.creacionales.factory;

public class TestFactory {
    public static void main(String[] args) {

        NotificationFactory smsFactory = new SMSFactory();
        Notification sms = smsFactory.createNotification();
        sms.send("Mensaje desde la Factory (SMS)");

        NotificationFactory emailFactory = new EmailFactory();
        Notification email = emailFactory.createNotification();
        email.send("Mensaje desde la Factory (Email)");
    }
}
