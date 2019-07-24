package com.example.design.factory.abstractFactory;

public class Test {
    public static void main(String[] args) {
        HpFactory hpFactory=new HpFactory();
        Mouse mouse=hpFactory.createMouse();
        mouse.say();
    }
}
