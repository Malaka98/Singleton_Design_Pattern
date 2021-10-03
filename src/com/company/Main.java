package com.company;

public class Main {

    public static void main(String[] args) {
       SingletonClass obj = SingletonClass.getInstance();
       obj.doSomething();

        SingletonClass obj2 = SingletonClass.getInstance();
        obj2.doSomething();

        SingletonClass obj3 = SingletonClass.getInstance();
        obj3.doSomething();
    }
}
