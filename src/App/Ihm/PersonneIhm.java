<<<<<<< HEAD
package App.Ihm;

import App.Entities.Personne;

public class PersonneIhm {
    public static Personne saisirPersonne(){
        System.out.println("Saisir les informations de la personne :");
        System.out.println("Age :");
        int age = Integer.parseInt(System.console().readLine());
        System.out.println("Nom :");
        String nom = System.console().readLine();
        System.out.println("Numéro de téléphone :");
        int numTelephone = Integer.parseInt(System.console().readLine());
        Personne personne = new Personne(age, nom, numTelephone);
        return personne;
    }
    
}
=======
package App.Ihm;

import App.Entities.Personne;

public class PersonneIhm {
    public static Personne saisirPersonne(){
        System.out.println("Saisir les informations de la personne :");
        System.out.println("Age :");
        int age = Integer.parseInt(System.console().readLine());
        System.out.println("Nom :");
        String nom = System.console().readLine();
        System.out.println("Numéro de téléphone :");
        int numTelephone = Integer.parseInt(System.console().readLine());
        Personne personne = new Personne(age, nom, numTelephone);
        return personne;
    }
    
}
>>>>>>> 1a433453e040eb56ba5b181ccf2a57c438255ac6
