package com.project;


import com.project.DessertItem;
import com.project.DessertShoppe;

import java.math.BigDecimal;

public class Candy extends DessertItem {
    private BigDecimal cost;
    public Candy(String name, double price, int amount) {
        String dollars = DessertShoppe.cents2dollarsAndCents(amount);
        this.cost = new BigDecimal(dollars).multiply(new BigDecimal(price)).setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(price+"lbs.@"+ dollars +"/lb.");
        System.out.println(name+" "+cost);
    }

    @Override
    public int getCost() {
        return cost.multiply(new BigDecimal(100)).intValueExact();
    }

}
