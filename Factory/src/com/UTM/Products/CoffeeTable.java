package com.UTM.Products;

import com.UTM.IProduct;

public class CoffeeTable implements IProduct {
    @Override
    public String getProductName() {
        return "Coffee Table";
    }

    @Override
    public float getProductPrice() {
        return 1399.99f;
    }
}
