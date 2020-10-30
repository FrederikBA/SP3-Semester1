public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addPizza(new Pizza(1, 57,"Vesuvio"));
        menu.addPizza(new Pizza(2, 53,"Amerikaner"));
        menu.addPizza(new Pizza(3, 57,"Cacciatore"));
        menu.addPizza(new Pizza(4,63,"Carbona"));
        menu.addPizza(new Pizza(5,63,"Dennis"));
        menu.addPizza(new Pizza(6,57,"Bertil"));
        menu.addPizza(new Pizza(7,61,"Silvia"));
        menu.addPizza(new Pizza(8,61,"Victoria"));
        menu.addPizza(new Pizza(9,61,"Toronfo"));
        menu.addPizza(new Pizza(10,61,"Capricciosa"));





        System.out.println(menu.toString());
    }
}

