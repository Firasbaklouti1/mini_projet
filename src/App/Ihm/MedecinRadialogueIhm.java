package App.Ihm;
import App.Entities.*;
import java.util.Scanner;

public class MedecinRadialogueIhm {
    public static MedecinRadialogue saisMedecinRadialogue(){
        Personne personne=PersonneIhm.saisirPersonne();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("introduire le id");
            int id=sc.nextInt();
            System.out.println("introduire le salaire");
            double salaire=sc.nextDouble();
            MedecinRadialogue medecinRadialogue=new MedecinRadialogue(personne.getAge(), personne.getNom(), personne.getNumTelephone(), id, salaire);
            return medecinRadialogue;
        }

    }
}
