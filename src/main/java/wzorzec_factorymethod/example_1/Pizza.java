package wzorzec_factorymethod.example_1;

import java.util.ArrayList;

public interface Pizza {

    String typeOfCake();
    String sauce();
    ArrayList<String> extras();

    String preparing();
    String baking();
    String slicing();
    String packing();

}
