package com.example.design.proxy.CGLIB;

public class Person {
    // 可以被代理
    public void eat() {
        System.out.println("人正在吃饭");
    }

    // final 方法不会被生成的字类覆盖
    public final void work() {
        System.out.println("人正在工作");
    }

    // private 方法不会被生成的字类覆盖
    private void play() {
        System.out.println("人正在玩游戏");
    }
}
