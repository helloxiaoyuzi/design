package com.example.design.factory.abstractFactory;

public class HpFactory extends PcFactory {
    @Override
    Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    Keybo createKeybo() {
        return new HpKeybo();
    }
}
