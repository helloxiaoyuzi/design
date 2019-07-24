package com.example.design.strategy;

public class Order {

    private String userId;

    private String orderId;

    private double price;

    public Order(String userId, String orderId, double price) {
        this.userId = userId;
        this.orderId = orderId;
        this.price = price;
    }

    public PayState pay(PayType payType){
        return payType.getPayment().pay(userId,price);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
