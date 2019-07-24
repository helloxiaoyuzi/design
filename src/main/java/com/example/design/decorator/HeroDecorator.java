package com.example.design.decorator;

public abstract class HeroDecorator implements Hero{

    private Hero hero;

    public HeroDecorator(Hero hero){
        this.hero=hero;
    }
    @Override
    public void init() {
        hero.init();
    }
}
