package App.Entities;

public class Technitien extends Personne {
    private int id;
    private  double salaire;

    public Technitien(int age, String nom, int numTelephone, int id,double salaire) {
        super(age, nom, numTelephone);
        this.id = id;
        this.salaire=salaire;
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
