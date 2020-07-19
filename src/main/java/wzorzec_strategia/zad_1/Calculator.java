package wzorzec_strategia.zad_1;


//  KONTEKST
public class Calculator {

    // kompozycja
    private CalculateOperation calculateOperation;

    public void setCalculateOperation(CalculateOperation calculateOperation) { // tu przekzujesz
        this.calculateOperation = calculateOperation;
    }

    public int calculate(int a, int b) {
        int result = 0;
        if (calculateOperation != null) {
            result = calculateOperation.calculate(a, b); // wywołanie metody w zależności od przekazanego: calculateOperation
        }
        return result;
    }
}


//        if ("add".equals(operator)) {
//            result = a + b;
//        } else if ("multiply".equals(operator)) {
//            result = a * b;
//        } else if ("divide".equals(operator)) {
//            result = a / b;
//        } else if ("substract".equals(operator)) {
//            result = a - b;
//        } else {
//            System.out.println("Unknown operator");
//        }