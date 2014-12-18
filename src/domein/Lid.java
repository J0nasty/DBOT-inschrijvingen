package domein;

/**
 * Created by Jonas on 18/12/2014.
 */

public class Lid implements Supporter{
    private String voornaam;
    private String naam;

    private final int busprijs = 5;

    public int getBusprijs(){return busprijs;}

    public Lid(String vn, String n) {
        setVoornaam(vn);
        setNaam(n);
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
