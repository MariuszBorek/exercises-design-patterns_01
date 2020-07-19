package wzorzec_strategia.zad_1;

// KONKTRETNA STRATEGIA B
public class SubtractOperation implements CalculateOperation {
    public int calculate(int a, int b) {
        return a-b;
    }
}
