package wzorzec_factorymethod.example_1;

public abstract class Pizzeria {

    public Pizza manufacturePizza(String order) {

        Pizza pizza = createPizza(order);

        pizza.baking();
        pizza.extras();
        pizza.packing();
        pizza.preparing();
        pizza.sauce();
        pizza.typeOfCake();

        return pizza;
    }


    protected abstract Pizza createPizza(String order);

}
