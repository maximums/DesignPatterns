package com.UTM.Builders;

import com.UTM.Products.CoffeeTable;

public class CoffeeTableBuilder implements Builder{
    private CoffeeTable coffeeTable;
    public CoffeeTableBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.coffeeTable = new CoffeeTable();
    }

    @Override
    public void setName(String name) {
        this.coffeeTable.setName(name);
    }

    @Override
    public void setStyle(String style) {
        this.coffeeTable.setStyle(style);
    }

    @Override
    public void setPrice(float price) {
        this.coffeeTable.setPrice(price);
    }
}
