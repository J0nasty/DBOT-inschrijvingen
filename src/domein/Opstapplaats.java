package domein;

import java.util.Date;

/**
 * Created by Jonas on 18/12/2014.
 */
public class Opstapplaats {

    private String naam;
    private Date vertrekUur;

    public String getNaam(){return naam;}
    public Date getVertrekUur(){return vertrekUur;}

    public void setNaam(String naam){this.naam = naam;}
    public void setVertrekUur(Date uur){this.vertrekUur = uur;}
}
