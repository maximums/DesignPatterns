package com.UTM.Products;

import com.UTM.Products.Types.Chair;

public class ModernChair implements Chair {
    @Override
    public String getName() {
        return "Chair";
    }

    @Override
    public String getStyle() {
        return "Modern";
    }

    @Override
    public float getPrice() {
        return 200f;
    }
}
