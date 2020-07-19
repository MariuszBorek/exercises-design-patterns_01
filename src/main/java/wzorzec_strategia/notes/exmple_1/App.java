package wzorzec_strategia.notes.exmple_1;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.setCalculateOperation(new AddOperation()); // tu łączy się interface CalculateOperation z AddOperation
        System.out.println(calculator.wykonajCalculate(5, 2));

        calculator.setCalculateOperation(new SubtractOperation());
        System.out.println(calculator.wykonajCalculate(5, 2));

        calculator.setCalculateOperation(new MultiplyOperation());
        System.out.println(calculator.wykonajCalculate(5, 2));

        calculator.setCalculateOperation(new DivideOperation());
        System.out.println(calculator.wykonajCalculate(5, 2));


    }
}
