package UI;

import Repositories.PizzaRepository;

import java.util.Scanner;

public class Menu implements IMenu {
    Scanner sc = new Scanner(System.in);

    public void showMenu() {
        System.out.println("1) Show menu");
        System.out.println("2) Place order");
        System.out.println("3) exit");
    }

    public int showMenuPizza() {
        int retVal = 0;
        System.out.println("1) Go back ");
        retVal = sc.nextInt();
        return retVal;
    }
}
