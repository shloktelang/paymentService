package com.shlok.paymentservice.controllers;

import com.shlok.paymentservice.dtos.CreatePaymentLinkRequestDto;
import com.shlok.paymentservice.services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String createPaymentLink(@RequestBody CreatePaymentLinkRequestDto requestDto) throws StripeException {
        return paymentService.createPaymentLink(requestDto.getOrderId());
    }
}
