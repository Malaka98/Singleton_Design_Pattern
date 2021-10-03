package com.company;

public class SingletonClass {

    private static SingletonClass singletonObj;
    private SingletonClass() {
        System.out.println("Object create");
    }

    public static SingletonClass getInstance() {

        if(singletonObj == null) {
            synchronized (SingletonClass.class) {
                if(singletonObj == null) {
                    singletonObj = new SingletonClass();
                }
            }
        }

        return singletonObj;
    }

    public void doSomething() {
        System.out.println("Do Something");
    }

}
