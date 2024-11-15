<<<<<<< HEAD
package App.Ihm;

import java.util.Scanner;

import App.Entities.*;


public class CentreRadialogueIhm {
    public static CentreRadialogue saisirCentreRadialogue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduire le nom du centre");
        String nom = scanner.nextLine();
        System.out.println("introduire l adresse du centre");
        String adresse = scanner.nextLine();
        System.out.println("introduire le revenu du centre");
        double revenu = scanner.nextDouble();
        System.out.println("introduire les depences");
        double depence = scanner.nextDouble();
        Agenda agenda=AgendaIhm.saisirAgenda();
        CentreRadialogue centre = new CentreRadialogue(nom, adresse, revenu, depence, agenda);
        return centre;
    }
}
=======
package App.Ihm;

import java.util.Scanner;

import App.Entities.*;


public class CentreRadialogueIhm {
    public static CentreRadialogue saisirCentreRadialogue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduire le nom du centre");
        String nom = scanner.nextLine();
        System.out.println("introduire l adresse du centre");
        String adresse = scanner.nextLine();
        System.out.println("introduire le revenu du centre");
        double revenu = scanner.nextDouble();
        System.out.println("introduire les depences");
        double depence = scanner.nextDouble();
        Agenda agenda=AgendaIhm.saisirAgenda();
        CentreRadialogue centre = new CentreRadialogue(nom, adresse, revenu, depence, agenda);
        return centre;
    }
}
>>>>>>> 1a433453e040eb56ba5b181ccf2a57c438255ac6
