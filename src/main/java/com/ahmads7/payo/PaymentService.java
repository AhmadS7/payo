package com.ahmads7.payo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PaymentService {
    @RequestMapping("/payment")
    public String paymentProcessing() {
        // Place your payment processing logic here
        // Simulate a payment transaction
        int amount = 10; // Replace with the actual amount
        return "Payment processed successfully!";
    }

}