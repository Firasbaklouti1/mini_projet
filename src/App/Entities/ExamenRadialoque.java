package App.Entities;

public class ExamenRadialoque {
    private MedecinRadialogue mr;
    private SalleExamen salle;
    private String type;
    private double prix;
    private int dure;
    
    public ExamenRadialoque(MedecinRadialogue mr, SalleExamen salle, String type,double prix,int dure) {
        this.mr = mr;
        this.salle = salle;
        this.type = type;
        this.prix=prix;
        this.dure=dure;
    }
    
    public MedecinRadialogue getMr() {
        return mr;
    }
    public void setMr(MedecinRadialogue mr) {
        this.mr = mr;
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
