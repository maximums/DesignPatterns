package com.UTM.Products;

import com.UTM.Products.Types.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public String getName() {
        return "Chair";
    }

    @Override
    public String getStyle() {
        return "Art Deco";
    }

    @Override
    public float getPrice() {
        return 450f;
    }
}
