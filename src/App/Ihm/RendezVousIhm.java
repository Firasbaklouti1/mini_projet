package App.Ihm;

import App.Entities.*;
import java.util.Scanner;

public class RendezVousIhm {
    public static RendezVous saisirRendezVous(){
        ExamenRadialoque examenRadialoque = ExamenRadialoqueIhm.saisExamenRadialogue();
        Date date = DateIhm.saisiDate();
        Patient patient = PatientIhm.saisirPatient();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le temp de debut");
        int tempDebut = scanner.nextInt();
        RendezVous rendezVous = new RendezVous(examenRadialoque, date, patient,tempDebut);
        return rendezVous;
    }
}
