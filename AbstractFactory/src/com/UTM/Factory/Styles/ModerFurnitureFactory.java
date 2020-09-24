package com.UTM.Factory.Styles;

import com.UTM.Factory.FurnitureFactory;
import com.UTM.Products.ModernChair;
import com.UTM.Products.ModernCoffeeTable;
import com.UTM.Products.ModernSofa;
import com.UTM.Products.Types.Chair;
import com.UTM.Products.Types.CoffeeTable;
import com.UTM.Products.Types.Sofa;

public class ModerFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return (Chair) new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return (Sofa) new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return (CoffeeTable) new ModernCoffeeTable();
    }
}
