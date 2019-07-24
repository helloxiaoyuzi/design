package com.example.design.decorator;

public class Test {
    public static void main(String[] args) {
        Hero victor = new Victor();
        GalacticWarriors galacticWarriors = new GalacticWarriors(victor);
        galacticWarriors.init();
    }
}
