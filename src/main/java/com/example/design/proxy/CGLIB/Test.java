package com.example.design.proxy.CGLIB;

public class Test {
    public static void main(String[] args) {
        Person person=new Engineer();
        // 生成 Cglib 代理类
        Person personProxy = (Engineer) CglibProxy.getProxy(person);
        // 调用相关方法
        personProxy.eat();

        personProxy.work();
    }
}
