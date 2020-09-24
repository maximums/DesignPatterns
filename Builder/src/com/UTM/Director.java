package com.UTM;

import com.UTM.Builders.Builder;

public class Director {

    public Builder constructVictorianChair(Builder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Victorian");
        builder.setPrice(700f);
        return builder;
    }

    public Builder constructModernChair(Builder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Modern");
        builder.setPrice(300f);
        return builder;
    }

    public Builder constructArtDecoChair(Builder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Art Deco");
        builder.setPrice(300f);
        return builder;
    }

    public Builder constructVictorianSofa(Builder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Victorian");
        builder.setPrice(3200f);
        return builder;
    }

    public Builder constructModernSofa(Builder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Modern");
        builder.setPrice(2225f);
        return builder;
    }

    public Builder constructArtDecoSofa(Builder builder){
        builder.reset();
        builder.setName("Sofa");
        builder.setStyle("Art Deco");
        builder.setPrice(2750f);
        return builder;
    }

    public Builder constructVictorianCoffeeTable(Builder builder){
        builder.reset();
        builder.setName("Coffee Table");
        builder.setStyle("Victorian");
        builder.setPrice(2999.99f);
        return builder;
    }

    public Builder constructModernCoffeeTable(Builder builder){
        builder.reset();
        builder.setName("Coffee Table");
        builder.setStyle("Modern");
        builder.setPrice(2000f);
        return builder;
    }

    public Builder constructArtDecoCoffeeTable(Builder builder){
        builder.reset();
        builder.setName("Chair");
        builder.setStyle("Art Deco");
        builder.setPrice(2500f);
        return builder;
    }
}
