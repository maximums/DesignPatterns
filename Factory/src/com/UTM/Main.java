package com.UTM;

import com.UTM.FactoryTypes.StandardFactory;

public class Main {

    public static void main(String[] args) {
        IFactoryProduct factory = new StandardFactory();
        System.out.println(factory.createProduct("Coffee").getProductName());
        System.out.println(factory.createProduct("Coffee").getProductPrice() + "$");
    }
}
