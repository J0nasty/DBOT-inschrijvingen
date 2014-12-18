package domein;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Jonas on 18/12/2014.
 */
public class Verplaatsing {

    //attributes
    private String opmerking;

    private Wedstrijd wedstrijd;
    private List<Opstapplaats> opstapplaatsen;
    private Categorie categorie;
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
