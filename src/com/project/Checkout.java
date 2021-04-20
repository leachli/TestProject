package com.project;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Checkout extends Object{
    private List<DessertItem> list;
    private int tax;
    Checkout(){
        this.list = new ArrayList<>(100);
    }

    public void clear(){
        list.clear();
    }

    public void enterItem(DessertItem item){
        list.add(item);
    }
    int numberOfItems(){
        return list.size();
    }

    int totalCost(){
       int totalCostAndTxt = list.stream().mapToInt(DessertItem::getCost).sum();
       this.tax = BigDecimal.valueOf(totalCostAndTxt)
                .multiply(new BigDecimal(DessertShoppe.TAX_RATE/100))
                .setScale(0,BigDecimal.ROUND_HALF_UP).intValue();
       return totalCostAndTxt -tax;
    }

    int totalTax(){
        return tax;
    }

    public String toString() {
        return DessertShoppe.STORE_NAME;
    }
}
