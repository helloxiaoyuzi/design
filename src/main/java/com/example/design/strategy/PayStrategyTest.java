package com.example.design.strategy;

import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

public class PayStrategyTest {

    public static void main(String[] args) {
        Order order=new Order("1","20190718001",267.09);

        System.out.println(order.pay(PayType.WEICHART_PAY));
    }
}
