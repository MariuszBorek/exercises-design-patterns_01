package wzorzec_strategia.zad_1;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setCalculateOperation(new AddOperation()); // polimorfizm
        int adding = calculator.calculate(2, 5);
        System.out.println(adding);

        calculator.setCalculateOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(10, 6));

        calculator.setCalculateOperation(new SubtractOperation());
        System.out.println(calculator.calculate(12, 4));

        calculator.setCalculateOperation(new DivideOperation());
        System.out.println(calculator.calculate(16, 3));

        // wzorzec_factorymethod: strategia
        // hermetyzacja
        // dziedziczenie
        // otwarta zmaknieta
        // tworzenie interfaceow

    }
}
