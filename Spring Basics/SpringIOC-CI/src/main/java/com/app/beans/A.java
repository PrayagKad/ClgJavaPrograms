package com.app.beans;

public class A {

    private B b;

    public A()
    {
        System.out.println(" A: 0 param constructor");
    }

    private A(B b)
    {
        System.out.println(" A :  1  param constructor");
        this.b = b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }
}
