package edu.ucaldas.behaviour.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando " + amount + " con tarjeta de crédito.");
    }
}
