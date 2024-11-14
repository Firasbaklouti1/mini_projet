package App.Entities;

public class Personne {
    protected int age;
    protected String nom;
    protected int numTelephone;
    public Personne(int age, String nom, int numTelephone) {
        this.age = age;
        this.nom = nom;
        this.numTelephone = numTelephone;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNumTelephone() {
        return numTelephone;
    }
    public void setNumTelephone(int numTelephone) {
        this.numTelephone = numTelephone;
    }
    
    
}
