package com.example.payment;

import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentService implements PaymentService {
    String payment = "RazorPay";

    @Override
    public String pay() {
        return "Payment done using " + payment;

    }

}
