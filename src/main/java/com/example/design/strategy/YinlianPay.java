package com.example.design.strategy;

public class YinlianPay implements Payment{
    @Override
    public PayState pay(String userId, double price) {
        System.out.println("使用银联支付");
        return new PayState(200,"支付成功",price);
    }
}
