package App.Entities;

public class Agenda {
    private Vacation[] tabVacation;
    private int vacationCount = 0;

    // Default constructor with default array size
    public Agenda() {
        this.tabVacation = new Vacation[360];
    }

    public Vacation[] getTabVacation() {
        return tabVacation;
    }

    public void setTabVacation(Vacation[] tabVacation) {
        this.tabVacation = tabVacation;
    }

    public int getVacationCount() {
        return vacationCount;
    }

    public void setVacationCount(int vacationCount) {
        this.vacationCount = vacationCount;
    }
    
}