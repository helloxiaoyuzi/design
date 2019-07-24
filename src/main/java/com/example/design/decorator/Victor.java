package com.example.design.decorator;

/**
 * 英雄维克托
 */
public class Victor implements Hero{
    @Override
    public void init() {
        System.out.println("维克托：输出型英雄 武器：步枪");
    }
}
