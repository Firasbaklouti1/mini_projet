package App.Service;
import App.Entities.Personne;
import App.Persistance.PersonnePersistance;
public class PersonneService {
    private Personne personne;

    public PersonneService(Personne personne) {
        this.personne = personne;
    }

    public void calcule (){
        Personne p1=this.personne;
        p1.setAge(p1.getAge()+10);
        PersonnePersistance.afficher(p1);
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
}
