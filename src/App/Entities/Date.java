package App.Entities;

public class Date {
    private int jour;
    private int mois;
    private int anne;
    public Date(int jour, int mois, int anne) {
        this.jour = jour;
        this.mois = mois;
        this.anne = anne;
    }
    public int getJour() {
        return jour;
    }
    public void setJour(int jour) {
        this.jour = jour;
    }
    public int getMois() {
        return mois;
    }
    public void setMois(int mois) {
        this.mois = mois;
    }
    public int getAnne() {
        return anne;
    }
    public void setAnne(int anne) {
        this.anne = anne;
    }
    
}
