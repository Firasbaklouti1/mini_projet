package App.Ihm;
import App.Entities.*;
import java.util.Scanner;
public class MedecinPrescripteurIhm {
    public static MedecinPrescripteur saisirMedecinPrescripteur(){
        Personne personne=PersonneIhm.saisirPersonne();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("introduire le id");
            int id=sc.nextInt();
            System.out.println("introduire le salaire");
            double salaire=sc.nextDouble();
            MedecinPrescripteur medecinPrescripteur=new MedecinPrescripteur(personne.getAge(), personne.getNom(), personne.getNumTelephone(), id, salaire);
            return medecinPrescripteur;
        }

    }
}
