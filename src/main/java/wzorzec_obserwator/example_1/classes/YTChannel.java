package wzorzec_obserwator.example_1.classes;

import wzorzec_obserwator.example_1.interfaces.Observer;
import wzorzec_obserwator.example_1.interfaces.Subject;

import java.util.ArrayList;

public class YTChannel implements Subject {

    private ArrayList<Observer> observerList;

    public YTChannel() {
        observerList = new ArrayList<>();
    }

    public void publishNewVideo() {
        System.out.println("YTChannel: Publish new video.");
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList) {
            o.update();
        }
    }


}
