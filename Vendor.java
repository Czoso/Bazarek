package com.company.People;

import com.company.Product;

public class Vendor extends Human {
    private Product product;
    public Vendor(String name, Product f)
    {
        super(name);
        product=f;
    }
}
