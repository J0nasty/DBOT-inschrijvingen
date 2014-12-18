package domein;

import java.util.Date;

/**
 * Created by Jonas on 18/12/2014.
 */
public class Wedstrijd {
    private Date datum;
    private Date startUur;
    private String tegenstander;
    private int ticketprijs;
    private boolean isCombi;

    public  Date getDatum(){return datum;}
    public  Date getStartUur(){return startUur;}
    public  String getTegenstander(){return tegenstander;}
    public  int getTicketprijs(){return ticketprijs;}
    public boolean isCombi(){return isCombi;}

    public void setDatum(Date datum){this.datum = datum;}
    public void setStartUur(Date uur){this.startUur = uur;}
    public void setTegenstander(String tegenstander){this.tegenstander = tegenstander;}
    public void setTicketprijs(int prijs){this.ticketprijs = prijs;}
    public void setIsCombi(boolean combi){this.isCombi = combi;}

}
