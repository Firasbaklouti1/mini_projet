package App.Persistance;
import App.Entities.Personne;
public class PersonnePersistance {
    public static void afficher(Personne p){
        System.out.println("le nome est "+p.getNom());
        System.out.println("nouvau age est "+p.getAge());
    }
}
