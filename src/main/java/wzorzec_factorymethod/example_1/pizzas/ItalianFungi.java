package wzorzec_factorymethod.example_1.pizzas;

import wzorzec_factorymethod.example_1.Pizza;

import java.util.ArrayList;

public class ItalianFungi implements Pizza {
    @Override
    public String typeOfCake() {
        return "ciasto: cienkie";
    }

    @Override
    public String sauce() {
        return "sos: pomidorowy";
    }

    @Override
    public ArrayList<String> extras() {
        ArrayList<String> extras = new ArrayList<>();
        extras.add("rukola");
        extras.add("parmezan");
        extras.add("ser pleśniowy");
        return extras;
    }

    @Override
    public String preparing() {
        return "przygotowuje pizze Italian Fungi";
    }

    @Override
    public String baking() {
        return "piecze pizze Italian Fungi";
    }

    @Override
    public String slicing() {
        return "kroje pizze Italian Fungi";
    }

    @Override
    public String packing() {
        return "pkuje pizze Italian Fungi";
    }
}
