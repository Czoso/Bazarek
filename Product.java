package com.company;

public class Product
{
    private String type;
    private int price;
    public Product(String t, int price )
    {
        type = t;
        this.price=price;
    }
    public String getName()
{
    return type;
}
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }


}
