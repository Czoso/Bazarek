package com.company;

import com.company.People.Customer;
import com.company.People.Vendor;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void Menu1() {

        System.out.println("Witaj na ryneczku!!! Na początku zapoznam Cię z zasadami. Każdego dnia masz dostęp do trzech sprzedawców: sprzedawcy jabłek, sprzedawcy truskawek oraz sprzedawcy marchwi.");
        System.out.println("Możesz wykonać 3 operacje dziennie, do których zalicza się kupno oraz sprzedaż. Na ryneczku możesz spędzić maksymalnie 10 dni, z czego ceny generowane są codziennie losowo w z góry określonych przedziałach");
        System.out.println("Sprzedajesz produkty po tej cenie co kupujesz. Zaczynasz z 1000 monet, najważniejsze jest jednak, ile monet dasz radę uzbierać po 10 dniach. Powodzenia!!!");
        System.out.println("Podaj swoję imię");
        Customer Player = new Customer("John", 0, 0, 0, 1000);
        Scanner scan = new Scanner(System.in);
        String scan1 = scan.nextLine();
        Player.setName(scan1);
        System.out.println("Witaj " + Player.getName());
        for (int i = 1; i < 11; i++) {
            Random sPrice = new Random();
            ArrayList<Product> Fruits = new ArrayList<>() ;
            Fruits.add(new Product("Jabłek",sPrice.nextInt(10) + 10));
            Fruits.add(new Product("Marchewek", sPrice.nextInt(10) + 20));
            Fruits.add(new Product("Truskawek", sPrice.nextInt(10) + 30));
            Vendor jakub = new Vendor("Jakub", Fruits.get(0));
            Vendor mati = new Vendor("Mateusz", Fruits.get(1));
            Vendor adek = new Vendor("Adrian", Fruits.get(2));
            System.out.println("Rozpoczyna się dzień " + i + ". W twoim posiadaniu znajduje się:");
            System.out.println(Player.getCoins() + " monet");
            System.out.println(Player.getAppleQuantity() + " jabłek");
            System.out.println(Player.getCarrotQuantity() + " marchewek");
            System.out.println(Player.getStrawberryQuantity() + " truskawek");
            for (int g = 1; g != 4; g++) {
                System.out.println("Jakiego sprzedawcę chcesz odwiedzić? Wpisz kolejno: 1 - sprzedawca jabłek, 2 - sprzedawca marchwi, 3 - sprzedawca truskawek, inne - nikogo (zakończ dzień)");
                Scanner vendorScan = new Scanner(System.in);
                int VendorNumber = vendorScan.nextInt();
                if (VendorNumber == 1) {
                    System.out.println("Dzień dobry, mam na imię "+ jakub.getName() + " i jestem sprzedawcą " + Fruits.get(0).getName() + " dzisiejsza cena to: " + Fruits.get(0).getPrice() + ". Nie chcesz może kupić[1] lub sprzedać[2] " + Fruits.get(0).getName() + "? A może nie jesteś zainteresowany?");
                    Scanner willScan = new Scanner(System.in);
                    int will = willScan.nextInt();
                    if (will == 1) {
                        System.out.println("Sprzedawca: Ile " + Fruits.get(0).getName() + " chcesz kupić?");
                        System.out.println("Stać Cię na " + (Player.getCoins() / Fruits.get(0).getPrice()) + Fruits.get(0).getName());
                        Scanner appleScan = new Scanner(System.in);
                        int quantity = appleScan.nextInt();
                        if (quantity * Fruits.get(0).getPrice() <= Player.getCoins()) {
                            System.out.println("Kupiłeś " + quantity + " jabłek");
                            Player.setCoins(Player.getCoins() - Fruits.get(0).getPrice() * quantity);
                            Player.setAppleQuantity(Player.getAppleQuantity() + quantity);
                            g++;
                        } else {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczcającej ilości gotówki przyjacielu. Wróć jak uzbierasz więcej monet.");
                        }
                    } else if (will == 2) {
                        System.out.println("Sprzedawca: Ile " + Fruits.get(0).getName() + " chcesz sprzedać?");
                        Scanner appleScan = new Scanner(System.in);
                        int quantity = appleScan.nextInt();
                        if (quantity <= Player.getAppleQuantity()) {
                            System.out.println("Sprzedałeś " + quantity + " " + Fruits.get(0).getName());
                            Player.setCoins(Player.getCoins() + Fruits.get(0).getPrice() * quantity);
                            Player.setAppleQuantity(Player.getAppleQuantity() - quantity);
                            g++;
                        } else {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczającej ilości jabłek przyjacielu.");
                        }
                    } else {
                        System.out.println("Sprzedawca: Cóż, w takim wypadku miłego dnia życzę");
                    }
                } else if (VendorNumber == 2) {
                    System.out.println("Dzień dobry, mam na imię " + mati.getName() + " i jestem sprzedawcą " + Fruits.get(1).getName() + " dzisiejsza cena to: " + Fruits.get(1).getPrice() + ". Nie chcesz może kupić[1] lub sprzedać[2] " + Fruits.get(1).getName() + "? A może nie jesteś zainteresowany?");
                    Scanner willScan = new Scanner(System.in);
                    int will = willScan.nextInt();
                    if (will == 1) {
                        System.out.println("Sprzedawca: Ile " + Fruits.get(1).getName() + " chcesz kupić?");
                        System.out.println("Stać Cię na " + (Player.getCoins() / Fruits.get(1).getPrice()) + Fruits.get(1).getName());
                        Scanner carrotScan = new Scanner(System.in);
                        int quantity = carrotScan.nextInt();
                        if (quantity * Fruits.get(1).getPrice() <= Player.getCoins()) {
                            System.out.println("Kupiłeś " + quantity + " " + Fruits.get(1).getName());
                            Player.setCoins(Player.getCoins() - Fruits.get(1).getPrice() * quantity);
                            Player.setCarrotQuantity(Player.getCarrotQuantity() + quantity);
                            g++;
                        } else {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczcającej ilości gotówki przyjacielu. Wróć jak uzbierasz więcej monet.");
                        }
                    } else if (will == 2) {
                        System.out.println("Sprzedawca: Ile " + Fruits.get(1).getName() + " chcesz sprzedać?");
                        Scanner carrotScan = new Scanner(System.in);
                        int quantity = carrotScan.nextInt();
                        if (quantity <= Player.getCarrotQuantity()) {
                            System.out.println("Sprzedałeś " + quantity + " marchewek");
                            Player.setCoins(Player.getCoins() + Fruits.get(1).getPrice() * quantity);
                            Customer.setCarrotQuantity(Player.getCarrotQuantity() - quantity);
                            g++;
                        } else {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczającej ilości marchewek przyjacielu.");
                        }
                    } else {
                        System.out.println("Sprzedawca: Cóż, w takim wypadku miłego dnia życzę");
                    }
                } else if (VendorNumber == 3) {
                    System.out.println("Dzień dobry, mam na imię " + adek.getName() + " i jestem sprzedawcą " + Fruits.get(2).getName() + " dzisiejsza cena to: " + Fruits.get(2).getPrice() + ". Nie chcesz może kupić[1] lub sprzedać[2] " + Fruits.get(2).getName() + "? A może nie jesteś zainteresowany?");
                    Scanner willScan = new Scanner(System.in);
                    int will = willScan.nextInt();
                    if (will == 1) {
                        System.out.println("Sprzedawca: Ile " + Fruits.get(2).getName() + " chcesz kupić?");
                        System.out.println("Stać Cię na " + (Player.getCoins() / Fruits.get(2).getPrice()) + Fruits.get(2).getName());

                        Scanner StrawberryScan = new Scanner(System.in);
                        int quantity = StrawberryScan.nextInt();
                        if (quantity * Fruits.get(2).getPrice() <= Player.getCoins()) {
                            System.out.println("Kupiłeś " + quantity + " " + Fruits.get(2).getName());

                            Player.setCoins(Player.getCoins() - Fruits.get(2).getPrice() * quantity);
                            Player.setStrawberryQuantity(Player.getStrawberryQuantity() + quantity);
                            g++;
                        } else {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczcającej ilości gotówki przyjacielu. Wróć jak uzbierasz więcej monet.");
                        }
                    } else if (will == 2) {
                        System.out.println("Sprzedawca: Ile " + Fruits.get(2).getName() + " chcesz sprzedać?");

                        Scanner strawberryScan = new Scanner(System.in);
                        int quantity = strawberryScan.nextInt();
                        if (quantity <= Player.getStrawberryQuantity()) {
                            System.out.println("Sprzedałeś " + quantity + " " + Fruits.get(2).getName());
                            Player.setCoins(Player.getCoins() + Fruits.get(2).getPrice() * quantity);
                            Customer.setStrawberryQuantity(Player.getStrawberryQuantity() - quantity);
                            g++;
                        } else {
                            System.out.println("Sprzedawca: Nie masz chyba wystarczającej ilości truskawek przyjacielu.");
                        }
                    } else {
                        System.out.println("Sprzedawca: Cóż, w takim wypadku miłego dnia życzę");
                    }
                } else {
                    g = 3;
                }
            }
        }
        System.out.println("Gratulacje!!! W ciągu 10 dni udało ci się zdobyć " + Player.getCoins() + " monet. Całkiem nieźle przyjacielu.");
        Scanner end = new Scanner(System.in);
        String ending = end.nextLine();
    }

}
