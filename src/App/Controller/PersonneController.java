package App.Controller;
import App.Entities.Personne;
import App.Ihm.PersonneIhm;
import App.Service.PersonneService;
public class PersonneController {
    private PersonneService personneService;
    
     public PersonneController() {
        Personne p=PersonneIhm.saisir();
        this.personneService = new PersonneService(p);
    }
    
    public PersonneService getPersonneService() {
        return personneService;
    }
    public void setPersonneService(PersonneService personneService) {
        this.personneService = personneService;
    }
    public void init(){
        this.personneService.calcule();
    }
     
}