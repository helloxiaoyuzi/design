package com.example.design.factory.standardFactory;

public class HpMouseFactory implements MouseFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
