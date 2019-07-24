package com.example.design.factory.abstractFactory;

public class DellFactory extends PcFactory {
    @Override
    Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    Keybo createKeybo() {
        return new DellKeybo();
    }
}
