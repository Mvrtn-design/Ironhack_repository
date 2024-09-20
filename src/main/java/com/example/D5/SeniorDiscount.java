package com.example.D5;

public class SeniorDiscount implements DiscountService {

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}
