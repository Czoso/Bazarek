package com.company;

public class Customer
{
    private String name;
    private static int applequantity;
    private static int carrotquantity;
    private static int strawberryquantity;
    private static int coins;
    public Customer(String n, int a, int c, int s, int coin)
    {
        applequantity = a;
        carrotquantity = c;
        strawberryquantity = s;
        name = n;
        coins = coin;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name1)
    {
        name = name1;
    }
    public static void setAppleQuantity(int applequantity1)
    {
        applequantity = applequantity1;
    }
    public static void setCarrotQuantity(int carrotquantity1)
    {
        carrotquantity = carrotquantity1;
    }
    public static void setStrawberryQuantity(int strawberryquantity1)
    {
        strawberryquantity = strawberryquantity1;
    }
    public int getCoins()
    {
        return coins;
    }
    public int getAppleQuantity()
    {
        return applequantity;
    }
    public int getCarrotQuantity()
    {
        return carrotquantity;
    }
    public int getStrawberryQuantity()
    {
        return strawberryquantity;
    }
    public static void setCoins(int coins1)
    {
        coins = coins1;
    }
}
