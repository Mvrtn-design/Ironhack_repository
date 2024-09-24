package com.example.Week1.D5;

public class PaymentService {
    private DatabaseService databaseService;

    PaymentService(DatabaseService d) {
        this.databaseService = d;
    }

    public void processPayment(Order order) {
        databaseService.savePayment(order);
    }

}
