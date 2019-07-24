package com.example.design.factory.simpleFactory;

/**
 * 简单工厂模式
 */
public class MouseFactory {

    public Mouse createMouse(int i){
        if(i==1){
            return new HpMouse();
        }else if(i==2){
            return new DellMouse();
        }else {
            return null;
        }
    }
}
