package com.example.design.proxy.CGLIB;

/**
 * 被代理类
 */
public class Engineer extends Person{
    // 可以被代理
    @Override
    public void eat() {
        System.out.println("工程师正在吃饭");
    }
}
