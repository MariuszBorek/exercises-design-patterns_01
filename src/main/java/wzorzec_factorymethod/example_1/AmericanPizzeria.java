package wzorzec_factorymethod.example_1;

import wzorzec_factorymethod.example_1.pizzas.AmericanFungi;
import wzorzec_factorymethod.example_1.pizzas.AmericanSalami;
import wzorzec_factorymethod.example_1.pizzas.ItalianFungi;
import wzorzec_factorymethod.example_1.pizzas.ItalianSalami;

public class AmericanPizzeria extends Pizzeria {

    @Override
    protected Pizza createPizza(String order) {
        if (order.equals("American Fungi")) {
            return new AmericanFungi();
        } else if (order.equals("American Salami")) {
            return new AmericanSalami();
        } else {
            throw new IllegalArgumentException("Unknown pizza: " + order);
        }
    }
}
