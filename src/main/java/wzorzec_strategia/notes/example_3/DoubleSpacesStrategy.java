package wzorzec_strategia.notes.example_3;

public class DoubleSpacesStrategy implements SpacesModificationStrategy {

    @Override
    public String replace(String text) {
        return text.replaceAll(" ", "  ");
    }
}
