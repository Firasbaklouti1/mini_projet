<<<<<<< HEAD
package App.Entities;

public class ExamenRadialoque {
    private MedecinRadialogue medecinRadialogue;
    private SalleExamen salle;
    private String type;
    private double prix;
    private int dure;
    
    public ExamenRadialoque(MedecinRadialogue medecinRadialogue, SalleExamen salle, String type,double prix,int dure) {
        this.medecinRadialogue = medecinRadialogue;
        this.salle = salle;
        this.type = type;
        this.prix=prix;
        this.dure=dure;
    }
    
    public MedecinRadialogue getmedecinRadialogue() {
        return medecinRadialogue;
    }
    public void setmedecinRadialogue(MedecinRadialogue medecinRadialogue) {
        this.medecinRadialogue = medecinRadialogue;
    }
    public SalleExamen getSalle() {
        return salle;
    }
    public void setSalle(SalleExamen salle) {
        this.salle = salle;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getDure() {
        return dure;
    }

    public void setDure(int dure) {
        this.dure = dure;
    }
    
    
}
=======
package App.Entities;

public class ExamenRadialoque {
    private MedecinRadialogue medecinRadialogue;
    private SalleExamen salle;
    private String type;
    private double prix;
    private int dure;
    
    public ExamenRadialoque(MedecinRadialogue medecinRadialogue, SalleExamen salle, String type,double prix,int dure) {
        this.medecinRadialogue = medecinRadialogue;
        this.salle = salle;
        this.type = type;
        this.prix=prix;
        this.dure=dure;
    }
    
    public MedecinRadialogue getmedecinRadialogue() {
        return medecinRadialogue;
    }
    public void setmedecinRadialogue(MedecinRadialogue medecinRadialogue) {
        this.medecinRadialogue = medecinRadialogue;
    }
    public SalleExamen getSalle() {
        return salle;
    }
    public void setSalle(SalleExamen salle) {
        this.salle = salle;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getDure() {
        return dure;
    }

    public void setDure(int dure) {
        this.dure = dure;
    }
    
    
}
>>>>>>> 1a433453e040eb56ba5b181ccf2a57c438255ac6
