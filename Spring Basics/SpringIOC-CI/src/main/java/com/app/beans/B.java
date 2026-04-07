package com.app.beans;

public class B {

    private A a;

    public B()
    {
        System.out.println("default constructor");
    }

    public B(A a) {
        System.out.println(" B: param constructor");
        this.a = a;
    }

    public void setA(A a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                '}';
    }
}
