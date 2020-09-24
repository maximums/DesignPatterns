package com.UTM.Products;

import com.UTM.Products.Types.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public String getName() {
        return "Sofa";
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }

    @Override
    public float getPrice() {
        return 3200f;
    }
}
