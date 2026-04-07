package com.app.beans;

import java.util.List;

public class User {

    private List<String> names;

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "User{" +
                "names=" + names +
                '}';
    }
}
