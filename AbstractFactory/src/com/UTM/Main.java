package com.UTM;

import com.UTM.Factory.Styles.ArtDecoFurnitureFactory;
import com.UTM.Factory.FurnitureFactory;
import com.UTM.Factory.Styles.ModerFurnitureFactory;
import com.UTM.Factory.Styles.VictorianFurnitureFactory;

public class Main {

    public static void main(String[] args) {
        FurnitureFactory factory = new ArtDecoFurnitureFactory();
        System.out.println(factory.createChair().getName());
        System.out.println(factory.createChair().getStyle());
        System.out.println(factory.createChair().getPrice());
        System.out.println(factory.createSofa().getName());
        System.out.println(factory.createSofa().getStyle());
        System.out.println(factory.createSofa().getPrice());
        System.out.println(factory.createCoffeeTable().getName());
        System.out.println(factory.createCoffeeTable().getStyle());
        System.out.println(factory.createCoffeeTable().getPrice());
        factory = new ModerFurnitureFactory();
        System.out.println(factory.createChair().getName());
        System.out.println(factory.createChair().getStyle());
        System.out.println(factory.createChair().getPrice());
        System.out.println(factory.createSofa().getName());
        System.out.println(factory.createSofa().getStyle());
        System.out.println(factory.createSofa().getPrice());
        System.out.println(factory.createCoffeeTable().getName());
        System.out.println(factory.createCoffeeTable().getStyle());
        System.out.println(factory.createCoffeeTable().getPrice());
        factory = new VictorianFurnitureFactory();
        System.out.println(factory.createChair().getName());
        System.out.println(factory.createChair().getStyle());
        System.out.println(factory.createChair().getPrice());
        System.out.println(factory.createSofa().getName());
        System.out.println(factory.createSofa().getStyle());
        System.out.println(factory.createSofa().getPrice());
        System.out.println(factory.createCoffeeTable().getName());
        System.out.println(factory.createCoffeeTable().getStyle());
        System.out.println(factory.createCoffeeTable().getPrice());

    }
}
