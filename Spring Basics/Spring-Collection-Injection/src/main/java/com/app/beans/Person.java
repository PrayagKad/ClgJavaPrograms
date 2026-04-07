package com.app.beans;

import java.util.Set;

public class Person {
    private Set<String> phones;

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Person{" +
                "phones=" + phones +
                '}';
    }
}
