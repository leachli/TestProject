package com.project;


public class Sundae extends IceCream {

    public Sundae(String name, int cost) {
        super(name, cost);
    }

    public Sundae(String name, int cost, String topping, int toppingCost) {
        super(topping + " Sundae with\n" + name, cost + toppingCost);
    }
}
