package com.UTM.Products;

import com.UTM.Products.Types.Sofa;

public class ArtDecoSofa implements Sofa {
    @Override
    public String getName() {
        return "Sofa";
    }

    @Override
    public String getStyle() {
        return "Art Deco";
    }

    @Override
    public float getPrice() {
        return 2100f;
    }
}
