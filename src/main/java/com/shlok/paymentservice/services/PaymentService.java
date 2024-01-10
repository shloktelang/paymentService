package com.shlok.paymentservice.services;

import com.shlok.paymentservice.paymentgateways.stripe.StripePaymentGateway;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private StripePaymentGateway stripePaymentGateway;

    public PaymentService(StripePaymentGateway stripePaymentGateway){
        this.stripePaymentGateway=stripePaymentGateway;
    }
    public String createPaymentLink(Long orderId) throws StripeException {
        return stripePaymentGateway.generatePaymentLink(10000L);
    }
}
