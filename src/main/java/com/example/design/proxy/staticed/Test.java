package com.example.design.proxy.staticed;

public class Test {

    public static void main(String[] args) {
        Target target=new Target();
        ProxyTarget proxyTarget=new ProxyTarget(target);

        proxyTarget.doSomeThing();

    }
}
