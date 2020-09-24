package com.UTM.Products;

import com.UTM.IProduct;

public class Sofa implements IProduct {
    @Override
    public String getProductName() {
        return "Sofa";
    }

    @Override
    public float getProductPrice() {
        return 2249.99f;
    }
}
