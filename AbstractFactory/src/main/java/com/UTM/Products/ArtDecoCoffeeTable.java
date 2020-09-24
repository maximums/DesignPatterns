package com.UTM.Products;

import com.UTM.Products.Types.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public String getName() {
        return "Coffee Table";
    }

    @Override
    public String getStyle() {
        return "Art Deco";
    }

    @Override
    public float getPrice() {
        return 1279.99f;
    }
}
