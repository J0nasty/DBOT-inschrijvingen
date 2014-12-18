package domein;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Jonas on 18/12/2014.
 */

@Entity
public class Verplaatsing {

    @Id
    @GeneratedValue
    private int id;
    //attributes
    private String opmerking;

    @OneToOne
    private Wedstrijd wedstrijd;

    @OneToMany
    private List<Opstapplaats> opstapplaatsen;

    private Categorie categorie;

    @OneToMany
    private List<Supporter> supporters;

    public String getOpmerking(){return opmerking;}

    public void setOpmerking(String opmerking){this.opmerking = opmerking;}

    //constructor
    public Verplaatsing()
    {
        opstapplaatsen = new ArrayList<Opstapplaats>();
        supporters = new ArrayList<Supporter>();
    }
}
