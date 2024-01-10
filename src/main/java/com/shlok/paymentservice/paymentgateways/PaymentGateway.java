package com.shlok.paymentservice.paymentgateways;

import com.stripe.exception.StripeException;

public interface PaymentGateway {
    String generatePaymentLink(Long amount) throws StripeException;
}
