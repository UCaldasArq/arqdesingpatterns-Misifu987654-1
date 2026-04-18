package edu.ucaldas.creacionales.factory;

public class TestNotification {
    public static void main(String[] args) {
        Notification sms = new SMSNotification();
        
        sms.send("Hola Nico, este es un mensaje de prueba.");
    }
}
