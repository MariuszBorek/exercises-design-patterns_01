package wzorzec_strategia.notes.example_3;

public class ReplaceWithUnderscoreStrategy implements SpacesModificationStrategy {
    @Override
    public String replace(String text) {
        return text.replaceAll(" ", "_");
    }
}
