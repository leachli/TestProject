package com.project;

import com.project.DessertItem;

public class Cookie extends DessertItem {
    private int cost;

    public Cookie(String name, int number, int price) {
        this.cost = number * price;
        System.out.println(name +" "+cost);
    }

    @Override
    public int getCost() {
        return cost;
    }
}
