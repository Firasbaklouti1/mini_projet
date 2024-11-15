package App.Ihm;

import App.Entities.*;
import java.util.Scanner;

public class TechnitienIhm {
    public static Technitien saisirTechnitien(){
        Personne personne=PersonneIhm.saisirPersonne();
        Scanner sc=new Scanner(System.in);
        System.out.println("introduire le salaire");
        double salaire=sc.nextDouble();
        System.out.println("introduire l'id");
        int id=sc.nextInt();
        Technitien technitien=new Technitien(personne.getAge(),personne.getNom(),personne.getNumTelephone(),id,salaire);
        return technitien;
    }
}
