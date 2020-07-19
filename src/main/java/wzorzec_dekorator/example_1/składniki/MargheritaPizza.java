package wzorzec_dekorator.example_1.składniki;

import wzorzec_dekorator.example_1.Pizza;

public class MargheritaPizza implements Pizza {
    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public float getCost() {
        return 18.99f;
    }



}
