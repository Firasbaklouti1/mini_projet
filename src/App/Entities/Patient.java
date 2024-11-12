package App.Entities;

public class Patient extends Personne {
    private int idPatient;
    private DossierMedicale dossierMedicale;

    public Patient(int age, String nom, int numTelephone, int idPatient,DossierMedicale dossierMedicale) {
        super(age, nom, numTelephone);
        this.idPatient = idPatient;
        this.dossierMedicale=dossierMedicale;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public DossierMedicale getDossierMedicale() {
        return dossierMedicale;
    }

    public void setDossierMedicale(DossierMedicale dossierMedicale) {
        this.dossierMedicale = dossierMedicale;
    }
    
    
}
