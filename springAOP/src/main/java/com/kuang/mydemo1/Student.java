package com.kuang.mydemo1;

public class Student implements Person{
    @Override
    public void sayHello() {
        System.out.println("I am Student");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
