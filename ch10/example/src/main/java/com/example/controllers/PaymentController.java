package com.example.controllers;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exceptions.NotEnoughMoneyException;
import com.example.models.ErrorDetails;
import com.example.models.PaymentDetails;
import com.example.services.PaymentService;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/oldpayment")
    public ResponseEntity<?> makResponseEntity() {

        try {
            PaymentDetails paymentDetails = paymentService.processPayment();

            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);

        } catch (NotEnoughMoneyException e) {
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enough money to make the payment.");

            return ResponseEntity.badRequest().body(errorDetails);
        }

    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestBody PaymentDetails paymentDetails) {
        logger.info("Recived payment " + paymentDetails.getAmount());

        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }

}
