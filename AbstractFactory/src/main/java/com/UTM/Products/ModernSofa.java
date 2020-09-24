package com.UTM.Products;

import com.UTM.Products.Types.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public String getName() {
        return "Sofa";
    }

    @Override
    public String getStyle() {
        return "Modern";
    }

    @Override
    public float getPrice() {
        return 1500;
    }
}
