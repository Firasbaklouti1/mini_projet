package App.Ihm;
import App.Entities.Personne;
import java.util.Scanner;
public class PersonneIhm {
    public static Personne saisir(){
        Scanner sc=new Scanner(System.in);
        System.out.println("donner votre nom");
        String nom =sc.next();
        System.out.println("votre num");
        int n=sc.nextInt();
        Personne p=new Personne(n, nom);
        sc.close();
        return p;
    }
    
}
