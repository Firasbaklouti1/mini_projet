package App.Entities;

public class DossierMedicale {
    RendezVous [] rendezVous=new RendezVous[100];
    CompteRendu [] compteRendus=new compteRendus[100];
    public DossierMedicale(RendezVous[] rendezVous, CompteRendu[] compteRendus) {
        this.rendezVous = rendezVous;
        this.compteRendus = compteRendus;
    }
    public RendezVous[] getRendezVous() {
        return rendezVous;
    }
    public void setRendezVous(RendezVous[] rendezVous) {
        this.rendezVous = rendezVous;
    }
    public CompteRendu[] getCompteRendus() {
        return compteRendus;
    }
    public void setCompteRendus(CompteRendu[] compteRendus) {
        this.compteRendus = compteRendus;
    }
    
}
