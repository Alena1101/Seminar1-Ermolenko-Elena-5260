package com.alena;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine {
    private List<HotDrink> list;


    public HotDrinkMachine() {
        list = new ArrayList<>();
        list.add(new HotDrink("coffee", 0.3, 90));
        list.add(new HotDrink("tea", 0.4, 70));
        list.add(new HotDrink("chocolate", 0.25, 100));
    }

    public HotDrink getProduct(String name, double volume, int temperature) {
        for (HotDrink hotDrink: list) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        for (HotDrink hotDrink: list) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume) {
                return hotDrink;
            }
        }
        return null;
    }
}
