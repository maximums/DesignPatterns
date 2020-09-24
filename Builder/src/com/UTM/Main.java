package com.UTM;

import com.UTM.Builders.ChairBuilder;
import com.UTM.Products.Chair;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        ChairBuilder builder = new ChairBuilder();
        director.constructVictorianChair(builder);
        Chair chair = builder.getProduct();
        System.out.println(chair.toString());
//        director.constructArtDecoChair(builder);
//        chair = builder.getProduct();
//        System.out.println(chair.toString());
//        director.constructModernChair(builder);
//        chair = builder.getProduct();
//        System.out.println(chair.toString());
    }
}
