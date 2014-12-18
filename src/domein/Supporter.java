package domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created by Jonas on 18/12/2014.
 */

@Entity
public class Supporter {

    @Id
    @GeneratedValue
    private int id;

    private String voornaam;
    private String naam;
    private boolean isLid;

    private int busprijs;

    public Supporter() {
    }

    public int getBusprijs(){return busprijs;}

    public void setBusprijs(int prijs){this.busprijs = prijs;}

    public Supporter(String vn, String n, boolean isLid) {
        setVoornaam(vn);
        setNaam(n);
        setIsLid(isLid);
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setIsLid(boolean isLid) {
        this.isLid = isLid;

        if(isLid)
            setBusprijs(5);
        else
            setBusprijs(10);
    }
}
