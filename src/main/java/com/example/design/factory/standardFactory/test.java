package com.example.design.factory.standardFactory;

public class test {
    public static void main(String[] args) {
        HpMouseFactory hpMouseFactory=new HpMouseFactory();
        Mouse mouse = hpMouseFactory.createMouse();
        mouse.say();
    }
}
