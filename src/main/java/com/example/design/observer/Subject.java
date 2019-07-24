package com.example.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class Subject {
    //观察者
    private List<Observer> observers=new ArrayList <>();
    //被观察者状态
    private int state;

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }



    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //被观察者状态改变时通知所有观察者
        notifyAllObservers();
    }
}
