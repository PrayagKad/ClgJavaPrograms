package com.app.beans;

import java.util.Arrays;

public class ColoursFactory {

    private String colors[];

    public void setColours(String[] colours) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "ColoursFactory{" +
                "colors=" + Arrays.toString(colors) +
                '}';
    }
}
