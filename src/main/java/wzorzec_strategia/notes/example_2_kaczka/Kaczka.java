package wzorzec_strategia.notes.example_2_kaczka;

public abstract class Kaczka {

    protected Kwakanie kwakanie;
    protected Latanie latanie;

    public Kaczka() {

    }

    public abstract void wyswietl();

    public void wykonajKwacz() {
        kwakanie.kwacz();
    }


    public void wykonajLec() {
        latanie.lec();
    }

    public void plywaj() {
        System.out.println("wszystkie kaczki pływają");
    }

    public void setKwakanie(Kwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }

    public void setLatanie(Latanie latanie) {
        this.latanie = latanie;
    }
}
