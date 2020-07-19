package wzorzec_factorymethod.example_1;

import wzorzec_factorymethod.example_1.pizzas.AmericanFungi;
import wzorzec_factorymethod.example_1.pizzas.ItalianFungi;
import wzorzec_factorymethod.example_1.pizzas.ItalianSalami;

import java.util.ArrayList;

public class ItalianPizzeria extends Pizzeria {

    @Override
    protected Pizza createPizza(String order) {
        if (order.equals("Italian Fungi")) {
            return new ItalianFungi();
        } else if (order.equals("Italian Salami")) {
            return new ItalianSalami();
        } else {
            throw new IllegalArgumentException("Unknown pizza: " + order);
        }
    }
}
