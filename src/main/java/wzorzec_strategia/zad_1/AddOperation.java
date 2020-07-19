package wzorzec_strategia.zad_1;

// KONKTRETNA STRATEGIA A
public class AddOperation implements CalculateOperation {
    public int calculate(int a, int b) {
        return a+b;
    }
}
