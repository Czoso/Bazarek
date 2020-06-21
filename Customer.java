package com.company.People;

public class Customer
{
    private String name;
    private static int appleQuantity;
    private static int carrotQuantity;
    private static int strawberryQuantity;
    private static int coins;
    public Customer(String n, int a, int c, int s, int coin)
    {
        appleQuantity = a;
        carrotQuantity = c;
        strawberryQuantity = s;
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
    public static void setAppleQuantity(int appleQuantity1)
    {
        appleQuantity = appleQuantity1;
    }
    public static void setCarrotQuantity(int carrotQuantity1)
    {
        carrotQuantity = carrotQuantity1;
    }
    public static void setStrawberryQuantity(int strawberryQuantity1)
    {
        strawberryQuantity = strawberryQuantity1;
    }
    public int getCoins()
    {
        return coins;
    }
    public int getAppleQuantity()
    {
        return appleQuantity;
    }
    public int getCarrotQuantity()
    {
        return carrotQuantity;
    }
    public int getStrawberryQuantity()
    {
        return strawberryQuantity;
    }
    public static void setCoins(int coins1)
    {
        coins = coins1;
    }
}
