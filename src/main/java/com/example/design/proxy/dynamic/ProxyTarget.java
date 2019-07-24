package com.example.design.proxy.dynamic;


/**
 * 代理对象
 */
public class ProxyTarget {
    private Target target;

    public ProxyTarget(Target target){
        this.target=target;
    }

    public void doSomeThing(){
        target.doSomeThing();
    }
}
