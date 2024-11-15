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
