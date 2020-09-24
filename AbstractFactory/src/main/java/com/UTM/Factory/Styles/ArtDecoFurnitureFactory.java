package com.UTM.Factory.Styles;

import com.UTM.Factory.FurnitureFactory;
import com.UTM.Products.ArtDecoChair;
import com.UTM.Products.ArtDecoCoffeeTable;
import com.UTM.Products.ArtDecoSofa;
import com.UTM.Products.Types.Chair;
import com.UTM.Products.Types.CoffeeTable;
import com.UTM.Products.Types.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return (Chair) new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return (Sofa) new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return (CoffeeTable) new ArtDecoCoffeeTable();
    }
}
