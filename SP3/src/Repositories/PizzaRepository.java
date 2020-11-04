package Repositories;

import Domain.Pizza;

import java.util.UUID;
import java.util.ArrayList;

public class PizzaRepository implements IPizzaRepository {
    private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
    private ArrayList<Pizza> orderedPizzas;
    private ArrayList<Pizza> soldPizzas;

    public PizzaRepository() {

        initializePizzas();
    }

    public ArrayList<Pizza> getAllPizza() {
        return pizzas;
    }

    public void initializePizzas() {
        pizzas.add(new Pizza(1, 57, "Vesuvio", "tomatsauce, ost, skinke og oregano"));
        pizzas.add(new Pizza(2, 53, "Amerikaner", "tomatsauce, ost, oksefars og oregano"));
        pizzas.add(new Pizza(3, 57, "Cacciatore", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano"));
        pizzas.add(new Pizza(4, 63, "Carbona", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano"));
        pizzas.add(new Pizza(5, 63, "Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano"));
        pizzas.add(new Pizza(6, 57, "Bertil", "tomatsauce, ost, bacon og oregano"));
        pizzas.add(new Pizza(7, 61, "Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano"));
        pizzas.add(new Pizza(8, 61, "Victoria", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano"));
        pizzas.add(new Pizza(9, 61, "Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano"));
        pizzas.add(new Pizza(10, 61, "Capricciosa", "tomatsauce, ost, skinke, champignon og oregano"));
        pizzas.add(new Pizza(11, 61, "Hawaii", "tomatsauce, ost, skinke, ananas og oregano"));
        
    }

    public String toString() {
        String result = "";

        for (Pizza pizza : pizzas) {

            result += "\n" + pizza;

        }

        return result;

    }
}
