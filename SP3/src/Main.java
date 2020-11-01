public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addPizza(new Pizza(1, 57,"Vesuvio","tomatsauce, ost, skinke og oregano"));
        menu.addPizza(new Pizza(2, 53,"Amerikaner", "tomatsauce, ost, oksefars og oregano"));
        menu.addPizza(new Pizza(3, 57,"Cacciatore", "tomatsauce, ost, pepperoni og oregano"));
        menu.addPizza(new Pizza(4,63,"Carbona", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano"));
        menu.addPizza(new Pizza(5,63,"Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano"));
        menu.addPizza(new Pizza(6,57,"Bertil", "tomatsauce, ost, bacon og oregano"));
        menu.addPizza(new Pizza(7,61,"Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano"));
        menu.addPizza(new Pizza(8,61,"Victoria", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano"));
        menu.addPizza(new Pizza(9,61,"Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano"));
        menu.addPizza(new Pizza(10,61,"Capricciosa", "tomatsauce, ost, skinke, champignon og oregano"));
        menu.addPizza(new Pizza(11,61,"Hawaii","tomatsauce, ost, skinke, ananas og oregano"));





        System.out.println(menu.toString());
    }
}

