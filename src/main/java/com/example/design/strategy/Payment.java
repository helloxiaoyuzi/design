package com.example.design.strategy;

public interface Payment {

    public PayState pay(String userId,double price);
}
