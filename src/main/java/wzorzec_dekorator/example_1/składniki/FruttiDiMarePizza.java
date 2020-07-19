package wzorzec_dekorator.example_1.składniki;

import wzorzec_dekorator.example_1.Pizza;

public class FruttiDiMarePizza implements Pizza {

    @Override
    public String getName() {
        return "FruttiDiMare";
    }

    @Override
    public float getCost() {
        return 30.99f;
    }
}
