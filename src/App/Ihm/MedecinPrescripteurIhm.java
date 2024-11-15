<<<<<<< HEAD
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
=======
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
>>>>>>> 1a433453e040eb56ba5b181ccf2a57c438255ac6
