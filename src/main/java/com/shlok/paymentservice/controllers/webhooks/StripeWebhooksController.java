package com.shlok.paymentservice.controllers.webhooks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhooks/stripe")
public class StripeWebhooksController {
    @GetMapping("/")
    public void handleWebhookRequest(){

    }
}
