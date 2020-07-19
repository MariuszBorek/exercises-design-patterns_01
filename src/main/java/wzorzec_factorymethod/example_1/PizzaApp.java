package wzorzec_factorymethod.example_1;

public class PizzaApp {
    public static void main(String[] args) {
        Pizzeria pizzeria = new ItalianPizzeria();
        pizzeria.createPizza("Italian Fungi");

        pizzeria = new AmericanPizzeria();
        pizzeria.createPizza("American Fungi");
    }
}
