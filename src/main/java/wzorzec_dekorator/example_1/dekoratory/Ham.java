package wzorzec_dekorator.example_1.dekoratory;

import wzorzec_dekorator.example_1.Pizza;
import wzorzec_dekorator.example_1.PizzaDecorator;

public class Ham implements PizzaDecorator {

    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName() + ", Ham";
    }

    @Override
    public float getCost() {
        return pizza.getCost() + 2.00f;
    }
}
