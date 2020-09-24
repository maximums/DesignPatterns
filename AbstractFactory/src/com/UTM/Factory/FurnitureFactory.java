package com.UTM.Factory;

import com.UTM.Products.Types.Chair;
import com.UTM.Products.Types.CoffeeTable;
import com.UTM.Products.Types.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
