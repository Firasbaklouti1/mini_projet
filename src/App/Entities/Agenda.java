package App.Entities;

public class Agenda {
    Vacation [] tabVacation=new Vacation[360];

    public Agenda(Vacation[] tabVacation) {
        this.tabVacation = tabVacation;
    }

    public Vacation[] getTabVacation() {
        return tabVacation;
    }

    public void setTabVacation(Vacation[] tabVacation) {
        this.tabVacation = tabVacation;
    }
    
}
