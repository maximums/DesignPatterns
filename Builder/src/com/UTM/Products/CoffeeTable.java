package com.UTM.Products;

public class CoffeeTable {
    private String name;
    private String style;
    private float price;

    public void setName(String name) {
        this.name = name;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CoffeeTable{" +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", price=" + price +
                '}';
    }
}
