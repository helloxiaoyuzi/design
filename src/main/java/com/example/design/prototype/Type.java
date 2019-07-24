package com.example.design.prototype;

import java.io.Serializable;

public class Type implements Cloneable,Serializable{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
