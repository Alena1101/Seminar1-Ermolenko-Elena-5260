package com.alena;

public class HotDrink extends Product {
    private int temperature;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HotDrink{");
        sb.append("temperature=").append(temperature);
        sb.append(", name='").append(name).append('\'');
        sb.append(", volume=").append(volume);
        sb.append('}');
        return sb.toString();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrink(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
}
