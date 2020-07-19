package wzorzec_strategia.notes.exmple_1;

// kontekst
public class Calculator {

    private CalculateOperation calculateOperation; // strategia: Strategia

    public void setCalculateOperation(CalculateOperation calculateOperation) { // ustawStrategie(strategia: Strategia)
        this.calculateOperation = calculateOperation;
    }

    public double wykonajCalculate(int a, int b) { // metoda kontekstu
        return calculateOperation.calculate(a, b);
    }
}
