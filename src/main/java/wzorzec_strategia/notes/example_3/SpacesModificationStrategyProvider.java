package wzorzec_strategia.notes.example_3;

public class SpacesModificationStrategyProvider {

    public SpacesModificationStrategy chooseAction(StrategyType strategyType) { // metoda zwraca klase z odpowiednio zaimplementowaną klasą do interfacu
        switch(strategyType) {
            case DOUBLE:
                return new DoubleSpacesStrategy();
            case REMOVE:
                return new RemoveSpacesStrategy();
            case REPLACE:
                return new ReplaceWithUnderscoreStrategy();
        }
        throw new UnsupportedOperationException();
    }


}
