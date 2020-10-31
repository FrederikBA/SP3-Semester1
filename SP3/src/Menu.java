import java.util.ArrayList;

public class Menu {
    ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public String toString() {
        String result = "";

        for (Pizza i : pizzas) {

            result += "\n" + i;

        }

        return result;

    }
}
