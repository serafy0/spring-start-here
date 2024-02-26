package com.example.webclient.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webclient.models.Payment;
import com.example.webclient.proxies.PaymentsProxy;

import reactor.core.publisher.Mono;

@RestController
public class PaymentController {
    private final PaymentsProxy paymentsProxy;

    public PaymentController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/payment")
    public Mono<Payment> createPayment(
            @RequestBody Payment payment) {
        String requestId = UUID.randomUUID().toString();

        return paymentsProxy.createPayment(requestId, payment);
    }
}
