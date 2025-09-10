package com.example.payment;

import org.springframework.stereotype.Component;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "Stripe")
public class StripePaymentService implements PaymentService {
    String payment = "Stripe";

    @Override
    public String pay() {
        return "Payment done using " + payment;

    }

}
