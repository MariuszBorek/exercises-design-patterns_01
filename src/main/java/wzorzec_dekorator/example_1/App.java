package wzorzec_dekorator.example_1;

import wzorzec_dekorator.example_1.dekoratory.Ham;
import wzorzec_dekorator.example_1.dekoratory.Ser;
import wzorzec_dekorator.example_1.składniki.SalamiPizza;

public class App {
    public static void main(String[] args) {

        Pizza pizza1 = new Ser(
                new Ham(
                        new SalamiPizza()));

        System.out.println("Pizza + składniki: " + pizza1.getName() + ", koszt: " + pizza1.getCost());



    }
}
