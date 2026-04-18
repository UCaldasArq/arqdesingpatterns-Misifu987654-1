package edu.ucaldas.behaviour.strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando " + amount + " con PayPal.");
    }
}
