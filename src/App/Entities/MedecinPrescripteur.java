package App.Entities;

public class MedecinPrescripteur extends Personne{
    private int id;
    private double salaire;
    public MedecinPrescripteur(int age, String nom, int numTelephone, int id, double salaire) {
        super(age, nom, numTelephone);
        this.id = id;
        this.salaire = salaire;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
}
