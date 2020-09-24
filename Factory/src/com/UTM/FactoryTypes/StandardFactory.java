package com.UTM.FactoryTypes;

import com.UTM.IFactoryProduct;
import com.UTM.IProduct;
import com.UTM.Products.Chair;
import com.UTM.Products.CoffeeTable;
import com.UTM.Products.Sofa;

public class StandardFactory implements IFactoryProduct {
    @Override
    public IProduct createProduct(String type) {
        return switch (type) {
            case "Coffee" -> new CoffeeTable();
            case "Sofa" -> new Sofa();
            case "Chair" -> new Chair();
            default -> null;
        };
    }
}
