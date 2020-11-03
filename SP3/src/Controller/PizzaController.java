package Controller;

import java.util.Scanner;

import Repositories.PizzaRepository;
import UI.Menu;

public class PizzaController {
    int choice = 0;
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();
    PizzaRepository pr = new PizzaRepository();


    public void runProgram() {
        while (choice != 9) {
            menu.showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showPizzaMenu();
                    break;
                case 2:
                    createOrder();
                    break;
                default:
                    choice = 9;
                    break;
            }
        }
    }


    private void createOrder() {
    }

    private void showPizzaMenu() {
        System.out.println(pr.toString());
        menu.showMenuPizza();
        switch (choice) {
            case 1:
                ;
                break;
        }

    }
}
