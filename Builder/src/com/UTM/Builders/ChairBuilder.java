package com.UTM.Builders;

import com.UTM.Products.Chair;

public class ChairBuilder implements Builder{
    private Chair chair;
    public ChairBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
        this.chair = new Chair();
    }

    @Override
    public void setName(String name) {
        chair.setName(name);
    }

    @Override
    public void setStyle(String style) {
        chair.setStyle(style);
    }

    @Override
    public void setPrice(float price) {
        chair.setPrice(price);
    }

    public Chair getProduct(){
        Chair product = this.chair;
        this.reset();
        return product;
    }
}
