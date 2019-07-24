package com.example.design.strategy;

public enum PayType {

    ALI_PAY(new AliPay()),
    JINGDONG_PAY(new JingdongPay()),
    YINLIAN_PAY(new YinlianPay()),
    WEICHART_PAY(new WeichartPay());

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
