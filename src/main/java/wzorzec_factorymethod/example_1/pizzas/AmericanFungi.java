package wzorzec_factorymethod.example_1.pizzas;

import wzorzec_factorymethod.example_1.Pizza;

import java.util.ArrayList;
import java.util.List;

public class AmericanFungi implements Pizza {
    @Override
    public String typeOfCake() {
        return "ciasto grube";
    }

    @Override
    public String sauce() {
        return "sos BBQ";
    }

    @Override
    public ArrayList<String> extras() {
        ArrayList<String> extras = new ArrayList<>();
        extras.add("salami");
        extras.add("szynka");
        extras.add("ser");
        return extras;
    }

    @Override
    public String preparing() {
        return "przygotowuje pizze America Fungi";
    }

    @Override
    public String baking() {
        return "piecze pizze America Fungi";
    }

    @Override
    public String slicing() {
        return "kroje pizze America Fungi";
    }

    @Override
    public String packing() {
        return "pakuje pizze America Fungi";
    }
}
