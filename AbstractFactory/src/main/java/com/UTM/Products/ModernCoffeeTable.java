package com.UTM.Products;

import com.UTM.Products.Types.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public String getName() {
        return "Coffee Table";
    }

    @Override
    public String getStyle() {
        return "Modern";
    }

    @Override
    public float getPrice() {
        return 999.99f;
    }
}
