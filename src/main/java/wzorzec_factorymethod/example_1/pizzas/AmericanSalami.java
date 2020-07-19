package wzorzec_factorymethod.example_1.pizzas;

import wzorzec_factorymethod.example_1.Pizza;

import java.util.ArrayList;

public class AmericanSalami implements Pizza {
    @Override
    public String typeOfCake() {
        return "ciasto: grube";
    }

    @Override
    public String sauce() {
        return "sos: ketchup";
    }

    @Override
    public ArrayList<String> extras() {
        ArrayList<String> extras = new ArrayList<>();
        extras.add("ser");
        extras.add("oliwki");
        extras.add("pomidory");
        return extras;
    }

    @Override
    public String preparing() {
        return "przygotowuje pizze American Salami";
    }

    @Override
    public String baking() {
        return "piecze pizze American Salami";
    }

    @Override
    public String slicing() {
        return "kroje pizze American Salami";
    }

    @Override
    public String packing() {
        return "pakuje pizze American Salami";
    }
}
