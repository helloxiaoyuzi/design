package com.example.design.proxy.staticed;

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
