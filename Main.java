package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Witaj na ryneczku!!! Na początku zapoznam Cię z zasadami. Każdego dnia masz dostęp do trzech sprzedawców: sprzedawcy jabłek, sprzedawcy truskawek oraz sprzedawcy marchwi.");
        System.out.println("Możesz wykonać 3 operacje dziennie, do których zalicza się kupno oraz sprzedaż. Na ryneczku możesz spędzić maksymalnie 10 dni, z czego ceny generowane są codziennie losowo w z góry określonych przedziałach");
        System.out.println("Sprzedajesz produkty po tej cenie co kupujesz. Zaczynasz z 1000 monet, najważniejsze jest jednak, ile monet dasz radę uzbierać po 10 dniach. Powodzenia!!!");
        System.out.println("Podaj swoję imię");
        Customer Player = new Customer("John", 0, 0, 0, 1000);
        Scanner scan = new Scanner(System.in);
        String scann = scan.nextLine();
        Player.setName(scann);
        System.out.println("Witaj " + Player.getName());
        for (int i=1; i<11; i++ )
        {
            Random SPrice = new Random();
            Random CPrice = new Random();
            Random APrice = new Random();
            int StrawberriesPrice = SPrice.nextInt(10) + 30;
            int CarrotsPrice = CPrice.nextInt(10) + 20;
            int ApplesPrice = SPrice.nextInt(10) + 10;
            Product apple = new Product ("Jabłek");
            Product carrot = new Product ("Marchewek");
            Product strawberry = new Product ("Truskawek");
            System.out.println("Rozpoczyna się dzień " + i + ". W twoim posiadaniu znajduje się:");
            System.out.println(Player.getCoins() + " monet");
            System.out.println(Player.getAppleQuantity() + " jabłek");
            System.out.println(Player.getCarrotQuantity() + " marchewek");
            System.out.println(Player.getStrawberryQuantity() + " truskawek");
            for (int g=1; g != 4; g++ )
            {
                System.out.println("Jakiego sprzedawcę chcesz odwiedzić? Wpisz kolejno: 1 - sprzedawca jabłek, 2 - sprzedawca marchwi, 3 - sprzedawca truskawek, inne - nikogo (zakończ dzień)");
                Scanner VendorScan = new Scanner(System.in);
                int VendorNumber = VendorScan.nextInt();
                if (VendorNumber == 1)
                {
                    System.out.println("Dzień dobry, jestem sprzedawcą " + apple.getName() + " dzisiejsza cena to: " + ApplesPrice + ". Nie chcesz może kupić[1] lub sprzedać[2] " + apple.getName() + "? A może nie jesteś zainteresowany?");
                    Scanner WillScan = new Scanner(System.in);
                    int will = WillScan.nextInt();
                    if (will == 1)
                    {
                        System.out.println("Sprzedawca: Ile " + apple.getName() + " chcesz kupić?");
                        System.out.println("Stać Cię na " + (Player.getCoins()/ApplesPrice) + apple.getName());
                        Scanner AppleScan = new Scanner(System.in);
                        int quantity = AppleScan.nextInt();
                        if (quantity * ApplesPrice <= Player.getCoins())
                        {
                            System.out.println("Kupiłeś " + quantity + " jabłek");
                            Player.setCoins(Player.getCoins() - ApplesPrice * quantity);
                            Player.setAppleQuantity(Player.getAppleQuantity() + quantity);
                            g++;
                        }
                        else
                            {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczcającej ilości gotówki przyjacielu. Wróć jak uzbierasz więcej monet.");
                            }
                    }
                    else if(will == 2)
                    {
                        System.out.println("Sprzedawca: Ile " + apple.getName() + " chcesz sprzedać?");
                        Scanner AppleScan = new Scanner(System.in);
                        int quantity = AppleScan.nextInt();
                        if (quantity <= Player.getAppleQuantity())
                        {
                            System.out.println("Sprzedałeś " + quantity + " " + apple.getName());
                            Player.setCoins(Player.getCoins() + ApplesPrice * quantity);
                            Player.setAppleQuantity(Player.getAppleQuantity() - quantity);
                            g++;
                        }
                        else
                            {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczającej ilości jabłek przyjacielu.");
                            }
                    }
                    else
                    {
                        System.out.println("Sprzedawca: Cóż, w takim wypadku miłego dnia życzę");
                    }
                }
                else if (VendorNumber == 2)
                {
                    System.out.println("Dzień dobry, jestem sprzedawcą " + carrot.getName() + " dzisiejsza cena to: " + CarrotsPrice + ". Nie chcesz może kupić[1] lub sprzedać[2] " + carrot.getName() + "? A może nie jesteś zainteresowany?");
                    Scanner WillScan = new Scanner(System.in);
                    int will = WillScan.nextInt();
                    if (will == 1)
                    {
                        System.out.println("Sprzedawca: Ile " + carrot.getName() + " chcesz kupić?");
                        System.out.println("Stać Cię na " + (Player.getCoins()/CarrotsPrice) + carrot.getName());
                        Scanner CarrotScan = new Scanner(System.in);
                        int quantity = CarrotScan.nextInt();
                        if (quantity * CarrotsPrice <= Player.getCoins())
                        {
                            System.out.println("Kupiłeś " + quantity + " " + carrot.getName());
                            Player.setCoins(Player.getCoins() - CarrotsPrice * quantity);
                            Player.setCarrotQuantity(Player.getCarrotQuantity() + quantity);
                            g++;
                        }
                        else
                        {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczcającej ilości gotówki przyjacielu. Wróć jak uzbierasz więcej monet.");
                        }
                    }
                    else if(will == 2)
                    {
                        System.out.println("Sprzedawca: Ile " + carrot.getName() + " chcesz sprzedać?");
                        Scanner CarrotScan = new Scanner(System.in);
                        int quantity = CarrotScan.nextInt();
                        if (quantity <= Player.getCarrotQuantity())
                        {
                            System.out.println("Sprzedałeś " + quantity + " marchewek");
                            Player.setCoins(Player.getCoins() + CarrotsPrice * quantity);
                            Customer.setCarrotQuantity(Player.getCarrotQuantity() - quantity);
                            g++;
                        }
                        else
                        {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczającej ilości marchewek przyjacielu.");
                        }
                    }
                    else
                    {
                        System.out.println("Sprzedawca: Cóż, w takim wypadku miłego dnia życzę");
                    }
                }
                else if (VendorNumber == 3)
                {
                    System.out.println("Dzień dobry, jestem sprzedawcą " + strawberry.getName() + " dzisiejsza cena to: " + StrawberriesPrice + ". Nie chcesz może kupić[1] lub sprzedać[2] " + strawberry.getName() + "? A może nie jesteś zainteresowany?");
                    Scanner WillScan = new Scanner(System.in);
                    int will = WillScan.nextInt();
                    if (will == 1)
                    {
                        System.out.println("Sprzedawca: Ile " + strawberry.getName() + " chcesz kupić?");
                        System.out.println("Stać Cię na " + (Player.getCoins()/StrawberriesPrice) + strawberry.getName());

                        Scanner StrawberryScan = new Scanner(System.in);
                        int quantity = StrawberryScan.nextInt();
                        if (quantity * StrawberriesPrice <= Player.getCoins())
                        {
                            System.out.println("Kupiłeś " + quantity + " " + strawberry.getName());

                            Player.setCoins(Player.getCoins() - StrawberriesPrice * quantity);
                            Player.setStrawberryQuantity(Player.getStrawberryQuantity() + quantity);
                            g++;
                        }
                        else
                        {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczcającej ilości gotówki przyjacielu. Wróć jak uzbierasz więcej monet.");
                        }
                    }
                    else if(will == 2)
                    {
                        System.out.println("Sprzedawca: Ile " + strawberry.getName() + " chcesz sprzedać?");

                        Scanner strawberryScan = new Scanner(System.in);
                        int quantity = strawberryScan.nextInt();
                        if (quantity <= Player.getStrawberryQuantity())
                        {
                            System.out.println("Sprzedałeś " + quantity + " " + strawberry.getName());
                            Player.setCoins(Player.getCoins() + StrawberriesPrice * quantity);
                            Customer.setStrawberryQuantity(Player.getStrawberryQuantity() - quantity);
                            g++;
                        }
                        else
                        {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczającej ilości truskawek przyjacielu.");
                        }
                    }
                    else
                    {
                        System.out.println("Sprzedawca: Cóż, w takim wypadku miłego dnia życzę");
                    }
                }
                else
                    {
                        g=3;
                }
            }
        }
        System.out.println("Gratulacje!!! W ciągu 10 dni udało ci się zdobyć " + Player.getCoins() + " monet. Całkiem nieźle przyjacielu.");
        Scanner end = new Scanner(System.in);
        String ending = end.nextLine();
    }
}
echo "# Bazarek" >> README.md
        git init
        git add README.md
        git commit -m "first commit"
        git remote add origin https://github.com/Czoso/Bazarek.git
        git push -u origin master
