package com.yxk;

public class yxkHelloImpl2 implements IyxkHello {
    @Override
    public String sayHello(String msg) {
        return "hello2:" + msg;
    }
}
