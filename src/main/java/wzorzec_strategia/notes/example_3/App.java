package wzorzec_strategia.notes.example_3;

public class App {
    public static void main(String[] args) {
        SpacesModificationStrategyProvider provider = new SpacesModificationStrategyProvider();

        SpacesModificationStrategy strategy1 = provider.chooseAction(StrategyType.REMOVE); // w tym miejscu
        System.out.println(strategy1.replace("cześć, co tam u ciebie? Wszystko OK?"));

        SpacesModificationStrategy strategy2 = provider.chooseAction(StrategyType.REPLACE);
        System.out.println(strategy2.replace("cześć, co tam u ciebie? Wszystko OK?"));

        SpacesModificationStrategy strategy3 = provider.chooseAction(StrategyType.DOUBLE);
        System.out.println(strategy3.replace("cześć, co tam u ciebie? Wszystko OK?"));


    }
}
