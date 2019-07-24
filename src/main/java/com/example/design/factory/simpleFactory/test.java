package com.example.design.factory.simpleFactory;

public class test {
    public static void main(String[] args) {
        MouseFactory mouseFactory=new MouseFactory();
        Mouse mouse=mouseFactory.createMouse(1);
        mouse.say();
    }
}
