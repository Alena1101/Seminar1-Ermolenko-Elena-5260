package com.alena;

public class Main {
    public static void main(String[] args) {
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        System.out.println(hotDrinkMachine.getProduct("coffee", 0.3));
        System.out.println(hotDrinkMachine.getProduct("coffee", 0.3, 90));
        System.out.println(hotDrinkMachine.getProduct("coffee", 0.5, 40));
    }

}