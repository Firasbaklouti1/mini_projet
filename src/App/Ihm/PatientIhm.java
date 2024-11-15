package App.Ihm;

import java.util.Scanner;

import App.Entities.DossierMedicale;
import App.Entities.Patient;
import App.Entities.Personne;

public class PatientIhm {
    public static Patient saisirPatient(){
        Personne personne=PersonneIhm.saisirPersonne();
        DossierMedicale dossierMedicale=DossierMedicaleIhm.saisirDossierMedicale();
        Scanner sc=new Scanner(System.in);
        System.out.println("introduire l idPatient");
        int id=sc.nextInt();
        Patient patient=new Patient(personne.getAge(),personne.getNom(),personne.getNumTelephone(),id,dossierMedicale);
        return patient;


    }
}
