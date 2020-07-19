package wzorzec_strategia.notes.example_2_kaczka;

public class App {
    public static void main(String[] args) {

        KaczkaDzika kaczkaDzika = new KaczkaDzika(new Kwacz(), new Lec());
        kaczkaDzika.wykonajKwacz();
        kaczkaDzika.wykonajLec();
    }
}
