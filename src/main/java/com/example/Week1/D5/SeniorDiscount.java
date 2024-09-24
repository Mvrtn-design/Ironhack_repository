package com.example.Week1.D5;

public class SeniorDiscount implements DiscountService {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}
