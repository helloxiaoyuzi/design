package com.example.design.proxy.dynamic;



public class Test {

    public static void main(String[] args) {
        Target target=new RealTarget();
        ProxyTarget proxyTarget=new ProxyTarget(target);

        proxyTarget.doSomeThing();

    }
}
