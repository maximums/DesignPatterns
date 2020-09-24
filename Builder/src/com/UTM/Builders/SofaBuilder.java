package com.UTM.Builders;

import com.UTM.Products.Sofa;

public class SofaBuilder implements Builder{
    private Sofa sofa;
    public SofaBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
        this.sofa = new Sofa();
    }

    @Override
    public void setName(String name) {
        sofa.setName(name);
    }

    @Override
    public void setStyle(String style) {
        sofa.setStyle(style);
    }

    @Override
    public void setPrice(float price) {
        sofa.setPrice(price);
    }
}
