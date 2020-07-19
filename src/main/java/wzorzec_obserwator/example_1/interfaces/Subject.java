package wzorzec_obserwator.example_1.interfaces;

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
