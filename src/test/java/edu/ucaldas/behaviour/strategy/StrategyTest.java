package edu.ucaldas.behaviour.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    void shouldExecutePaymentWithCreditCard() {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        assertDoesNotThrow(() -> context.executePayment(100));
    }

    @Test
    void shouldExecutePaymentWithPayPal() {
        PaymentContext context = new PaymentContext(new PayPalPayment());
        assertDoesNotThrow(() -> context.executePayment(200));
    }
}
