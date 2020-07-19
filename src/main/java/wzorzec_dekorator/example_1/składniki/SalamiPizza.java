package wzorzec_dekorator.example_1.składniki;

import wzorzec_dekorator.example_1.Pizza;

public class SalamiPizza implements Pizza {
    @Override
    public String getName() {
        return "Salami";
    }

    @Override
    public float getCost() {
        return 25.99f;
    }
}
