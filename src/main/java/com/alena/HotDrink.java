package com.alena;

public class TemperatureHotDrink extends HotDrink {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public TemperatureHotDrink(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
}
