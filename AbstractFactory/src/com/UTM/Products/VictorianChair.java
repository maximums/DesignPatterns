package com.UTM.Products;

import com.UTM.Products.Types.Chair;

public class VictorianChair implements Chair {
    @Override
    public String getName() {
        return "Chair";
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }

    @Override
    public float getPrice() {
        return 500f;
    }
}
