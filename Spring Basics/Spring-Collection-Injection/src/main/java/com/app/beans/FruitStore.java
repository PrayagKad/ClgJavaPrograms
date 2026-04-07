package com.app.beans;

import java.util.Properties;

public class FruitStore {

    private Properties fruitColours;

    public void setFruitColours(Properties fruitColours) {
        this.fruitColours = fruitColours;
    }

    @Override
    public String toString() {
        return "FruitStore{" +
                "fruitColours=" + fruitColours +
                '}';
    }
}
