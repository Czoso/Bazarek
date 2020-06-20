package com.company;

public class Vendor extends Human {
    private Product product;
    private double price;
    public Vendor(String name, Product f, double p)
    {
        super(name);
        product=f;
        price=p;
    }
    public void setPrice(int cash)
    {
        this.price=cash;
    }

    public double getPrice() {
        return price;
    }
}
