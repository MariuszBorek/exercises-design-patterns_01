package wzorzec_strategia.notes.exmple_1;

public class MultiplyOperation implements CalculateOperation {
    @Override
    public double calculate(int a, int b) {
        return a*b;
    }
}
