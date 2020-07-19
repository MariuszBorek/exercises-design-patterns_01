package wzorzec_obserwator.example_1.classes;

public class Client {
    public static void main(String[] args) {

        YTChannel ytChannel = new YTChannel();

        YTUser ytUser = new YTUser("Mariusz");
        ytChannel.register(ytUser);

        ytChannel.publishNewVideo();
        System.out.println("---------------------");

        YTUser ytUser1 = new YTUser("Gaba");
        ytChannel.register(ytUser1);
        ytChannel.publishNewVideo();
        System.out.println("---------------------");

        ytChannel.unregister(ytUser);
        ytChannel.publishNewVideo();




    }
}
