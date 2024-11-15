<<<<<<< HEAD
package App.Ihm;
import App.Entities.*;
public class VacationIhm {
    public static Vacation saisrVacation(){
        System.out.println("Saisir la date de la vacance");
        Date date=DateIhm.saisiDate();
        Vacation vacation=new Vacation(date);
        return vacation;

    }
}
=======
package App.Ihm;
import App.Entities.*;
public class VacationIhm {
    public static Vacation saisrVacation(){
        System.out.println("Saisir la date de la vacance");
        Date date=DateIhm.saisiDate();
        Vacation vacation=new Vacation(date);
        return vacation;

    }
}
>>>>>>> 1a433453e040eb56ba5b181ccf2a57c438255ac6
