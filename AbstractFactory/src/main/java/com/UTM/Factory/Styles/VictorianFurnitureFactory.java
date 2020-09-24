package com.UTM.Factory.Styles;

import com.UTM.Factory.FurnitureFactory;
import com.UTM.Products.Types.Chair;
import com.UTM.Products.Types.CoffeeTable;
import com.UTM.Products.Types.Sofa;
import com.UTM.Products.VictorianChair;
import com.UTM.Products.VictorianCoffeeTable;
import com.UTM.Products.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return (Chair) new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return (Sofa) new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return (CoffeeTable) new VictorianCoffeeTable();
    }
}
