<<<<<<< HEAD
package App.Entities;

public class DossierMedicale {
    private RendezVous[] rendezVous;
    private CompteRendu[] compteRendus;
    private int rendezVousCount = 0;
    private int compteRenduCount = 0;

    public DossierMedicale() {
        this.rendezVous = new RendezVous[100];
        this.compteRendus = new CompteRendu[100];
    }

    public DossierMedicale(RendezVous[] rendezVous, CompteRendu[] compteRendus) {
        this.rendezVous = rendezVous;
        this.compteRendus = compteRendus;
        this.rendezVousCount = rendezVous.length;
        this.compteRenduCount = compteRendus.length;
    }

    public RendezVous[] getRendezVous() {
        return rendezVous;
    }

    public void setRendezVous(RendezVous[] rendezVous) {
        this.rendezVous = rendezVous;
        this.rendezVousCount = rendezVous.length;
    }

    public CompteRendu[] getCompteRendus() {
        return compteRendus;
    }

    public void setCompteRendus(CompteRendu[] compteRendus) {
        this.compteRendus = compteRendus;
        this.compteRenduCount = compteRendus.length;
    }

    
}

=======
package App.Entities;

public class DossierMedicale {
    private RendezVous[] rendezVous;
    private CompteRendu[] compteRendus;
    private int rendezVousCount = 0;
    private int compteRenduCount = 0;

    public DossierMedicale() {
        this.rendezVous = new RendezVous[100];
        this.compteRendus = new CompteRendu[100];
    }

    public DossierMedicale(RendezVous[] rendezVous, CompteRendu[] compteRendus) {
        this.rendezVous = rendezVous;
        this.compteRendus = compteRendus;
        this.rendezVousCount = rendezVous.length;
        this.compteRenduCount = compteRendus.length;
    }

    public RendezVous[] getRendezVous() {
        return rendezVous;
    }

    public void setRendezVous(RendezVous[] rendezVous) {
        this.rendezVous = rendezVous;
        this.rendezVousCount = rendezVous.length;
    }

    public CompteRendu[] getCompteRendus() {
        return compteRendus;
    }

    public void setCompteRendus(CompteRendu[] compteRendus) {
        this.compteRendus = compteRendus;
        this.compteRenduCount = compteRendus.length;
    }

    
}

>>>>>>> 1a433453e040eb56ba5b181ccf2a57c438255ac6
