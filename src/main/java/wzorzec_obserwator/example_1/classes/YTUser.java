package wzorzec_obserwator.example_1.classes;

import wzorzec_obserwator.example_1.interfaces.Observer;

public class YTUser implements Observer {

    private String name;
    private int videoToWatch;

    public YTUser(String name) {
        this.name = name;
        videoToWatch = 0;
    }

    @Override
    public void update() {
        videoToWatch++;
        System.out.println("Hej " + name + "! There is a new video! You have " + videoToWatch + " videos to watch.");
    }
}
