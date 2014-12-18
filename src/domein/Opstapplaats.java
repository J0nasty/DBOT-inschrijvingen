package domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Jonas on 18/12/2014.
 */

@Entity
public class Opstapplaats {

    @Id
    @GeneratedValue
    private int id;

    private String naam;
    private Date vertrekUur;

    public String getNaam(){return naam;}
    public Date getVertrekUur(){return vertrekUur;}

    public void setNaam(String naam){this.naam = naam;}
    public void setVertrekUur(Date uur){this.vertrekUur = uur;}
}
