package com.UTM.Products;

import com.UTM.IProduct;

public class Chair implements IProduct {
    @Override
    public String getProductName() {
        return "Chair";
    }

    @Override
    public float getProductPrice() {
        return 450f;
    }
}
