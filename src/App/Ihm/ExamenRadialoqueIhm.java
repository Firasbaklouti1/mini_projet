<<<<<<< HEAD
package App.Ihm;
import App.Entities.*;
import java.util.Scanner;

public class ExamenRadialoqueIhm {
    public static ExamenRadialoque saisExamenRadialogue(){
        try (Scanner sc = new Scanner(System.in)) {
            MedecinRadialogue medecinRadialogue = MedecinRadialogueIhm.saisMedecinRadialogue();
            SalleExamen salle=SalleExamenIhm.saisirSalleExamen();
            System.out.println("introduire le type");
            String type=sc.next();
            System.out.println("introduire le prix");
            double prix=sc.nextDouble();
            System.out.println("introduire la dure");
            int dure=sc.nextInt();
            ExamenRadialoque examenRadialogue=new ExamenRadialoque(medecinRadialogue, salle, type, prix, dure);
            return examenRadialogue;
        }
    }
}
=======
package App.Ihm;
import App.Entities.*;
import java.util.Scanner;

public class ExamenRadialoqueIhm {
    public static ExamenRadialoque saisExamenRadialogue(){
        try (Scanner sc = new Scanner(System.in)) {
            MedecinRadialogue medecinRadialogue = MedecinRadialogueIhm.saisMedecinRadialogue();
            SalleExamen salle=SalleExamenIhm.saisirSalleExamen();
            System.out.println("introduire le type");
            String type=sc.next();
            System.out.println("introduire le prix");
            double prix=sc.nextDouble();
            System.out.println("introduire la dure");
            int dure=sc.nextInt();
            ExamenRadialoque examenRadialogue=new ExamenRadialoque(medecinRadialogue, salle, type, prix, dure);
            return examenRadialogue;
        }
    }
}
>>>>>>> 1a433453e040eb56ba5b181ccf2a57c438255ac6
