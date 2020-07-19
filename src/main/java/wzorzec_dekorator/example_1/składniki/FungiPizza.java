package wzorzec_dekorator.example_1.składniki;

import wzorzec_dekorator.example_1.Pizza;

public class FungiPizza implements Pizza {

    @Override
    public String getName() {
        return "Fungi";
    }

    @Override
    public float getCost() {
        return 20.50f;
    }
}
