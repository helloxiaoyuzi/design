package com.example.design.prototype;

import java.io.Serializable;

public abstract class Shape implements Cloneable,Serializable{

    private String id;

    protected Type type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * 实现深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Object object = super.clone();
//        Shape shape= (Shape) object;
//        shape.type= (Type) this.type.clone();
//        return object;
//    }

    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
