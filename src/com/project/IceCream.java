package com.project;


import com.project.DessertItem;
import com.project.DessertShoppe;

import java.math.BigDecimal;

public class IceCream extends DessertItem {
    private BigDecimal cost;

    public IceCream(String name, int cost) {
        this.cost = BigDecimal.valueOf(cost).setScale(0,BigDecimal.ROUND_HALF_UP);
        System.out.println(name +" " +DessertShoppe.cents2dollarsAndCents(cost));
    }

    @Override
    public int getCost() {
        return cost.intValueExact();
    }
}
