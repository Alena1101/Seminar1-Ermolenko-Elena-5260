package com.alena;

public class Product {
   protected String name;
   protected double volume;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", volume=").append(volume);
        sb.append('}');
        return sb.toString();
    }

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

    public Product(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }
}
