package com.example.design.proxy.dynamic;

public class RealTarget implements Target{
    @Override
    public void doSomeThing() {
        System.out.println("被代理对象执行了");
    }
}
