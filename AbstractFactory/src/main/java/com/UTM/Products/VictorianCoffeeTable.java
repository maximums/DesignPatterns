package com.UTM.Products;

import com.UTM.Products.Types.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public String getName() {
        return "Coffee Table";
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }

    @Override
    public float getPrice() {
        return 2225f;
    }
}
