package com.alena;

public class HotDrink {
   private String name;
   private double volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public HotDrink(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }
}
