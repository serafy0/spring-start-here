package com.example.services;

import org.springframework.stereotype.Service;

import com.example.exceptions.NotEnoughMoneyException;
import com.example.models.PaymentDetails;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
