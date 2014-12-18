package domein;

/**
 * Created by Jonas on 18/12/2014.
 */
public class NietLid implements Supporter{
    private String voornaam;
    private String naam;

    private final int busprijs = 10;

    public int getBusprijs(){return busprijs;}

    public NietLid(String vn, String n) {
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
