package com.yxk;

public class yxkHelloImpl implements IyxkHello {
    @Override
    public String sayHello(String msg) {
        return "hello:" + msg;
    }
}
