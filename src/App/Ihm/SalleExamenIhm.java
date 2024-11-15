<<<<<<< HEAD
package App.Ihm;

import App.Entities.*;
import java.util.Scanner;

public class SalleExamenIhm {
    //faire la methode saisirSalleExamen qui permet de saisir les informations d'une salle d'examen(SalleExamen dans Entities)
    public static SalleExamen saisirSalleExamen(){
        String nom;
        int num;
        String techniqueAcquisitionpe;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("introduire le nom de la salle");
            nom = sc.nextLine();
            System.out.println("introduire le numero de la salle");
            num = sc.nextInt();
            System.out.println("introduire le techniqueAcquisitionpe");
            techniqueAcquisitionpe = sc.nextLine();
        }
       SalleExamen salleExamen=new SalleExamen(num,nom,techniqueAcquisitionpe);
       return(salleExamen);




    }
}
=======
package App.Ihm;

import App.Entities.*;
import java.util.Scanner;

public class SalleExamenIhm {
    //faire la methode saisirSalleExamen qui permet de saisir les informations d'une salle d'examen(SalleExamen dans Entities)
    public static SalleExamen saisirSalleExamen(){
        String nom;
        int num;
        String techniqueAcquisitionpe;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("introduire le nom de la salle");
            nom = sc.nextLine();
            System.out.println("introduire le numero de la salle");
            num = sc.nextInt();
            System.out.println("introduire le techniqueAcquisitionpe");
            techniqueAcquisitionpe = sc.nextLine();
        }
       SalleExamen salleExamen=new SalleExamen(num,nom,techniqueAcquisitionpe);
       return(salleExamen);




    }
}
>>>>>>> 1a433453e040eb56ba5b181ccf2a57c438255ac6
