<<<<<<< HEAD
package App.Entities;

public class CentreRadialogue {
    private String nom;
    private String adresse;
    private double revenu;
    private double depence;
    private Agenda agenda;
    private SalleExamen[] tabsalleExamens = new SalleExamen[100];
    private MedecinPrescripteur[] tabmedecinPrescripteurs = new MedecinPrescripteur[100];
    private MedecinRadialogue[] tabmedecinRadialogues = new MedecinRadialogue[100];
    private Technitien[] tabtechnitiens = new Technitien[100];
    private int salleCount = 0;
    private int prescripteurCount = 0;
    private int radialogueCount = 0;
    private int technitienCount = 0;

    public CentreRadialogue(String nom, String adresse, double revenu, double depence, Agenda agenda) {
        this.nom = nom;
        this.adresse = adresse;
        this.revenu = revenu;
        this.depence = depence;
        this.agenda = agenda;
        this.tabsalleExamens = new SalleExamen[100];
        this.tabmedecinPrescripteurs = new MedecinPrescripteur[100];
        this.tabmedecinRadialogues = new MedecinRadialogue[100];
        this.tabtechnitiens = new Technitien[100];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getRevenu() {
        return revenu;
    }

    public void setRevenu(double revenu) {
        this.revenu = revenu;
    }

    public double getDepence() {
        return depence;
    }

    public void setDepence(double depence) {
        this.depence = depence;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public SalleExamen[] getTabsalleExamens() {
        return tabsalleExamens;
    }

    public void setTabsalleExamens(SalleExamen[] tabsalleExamens) {
        this.tabsalleExamens = tabsalleExamens;
    }

    public MedecinPrescripteur[] getTabmedecinPrescripteurs() {
        return tabmedecinPrescripteurs;
    }

    public void setTabmedecinPrescripteurs(MedecinPrescripteur[] tabmedecinPrescripteurs) {
        this.tabmedecinPrescripteurs = tabmedecinPrescripteurs;
    }

    public MedecinRadialogue[] getTabmedecinRadialogues() {
        return tabmedecinRadialogues;
    }

    public void setTabmedecinRadialogues(MedecinRadialogue[] tabmedecinRadialogues) {
        this.tabmedecinRadialogues = tabmedecinRadialogues;
    }

    public Technitien[] getTabtechnitiens() {
        return tabtechnitiens;
    }

    public void setTabtechnitiens(Technitien[] tabtechnitiens) {
        this.tabtechnitiens = tabtechnitiens;
    }

    public int getSalleCount() {
        return salleCount;
    }

    public void setSalleCount(int salleCount) {
        this.salleCount = salleCount;
    }

    public int getPrescripteurCount() {
        return prescripteurCount;
    }

    public void setPrescripteurCount(int prescripteurCount) {
        this.prescripteurCount = prescripteurCount;
    }

    public int getRadialogueCount() {
        return radialogueCount;
    }

    public void setRadialogueCount(int radialogueCount) {
        this.radialogueCount = radialogueCount;
    }

    public int getTechnitienCount() {
        return technitienCount;
    }

    public void setTechnitienCount(int technitienCount) {
        this.technitienCount = technitienCount;
    }
    

    

    


}
=======
package App.Entities;

public class CentreRadialogue {
    private String nom;
    private String adresse;
    private double revenu;
    private double depence;
    private Agenda agenda;
    private SalleExamen[] tabsalleExamens = new SalleExamen[100];
    private MedecinPrescripteur[] tabmedecinPrescripteurs = new MedecinPrescripteur[100];
    private MedecinRadialogue[] tabmedecinRadialogues = new MedecinRadialogue[100];
    private Technitien[] tabtechnitiens = new Technitien[100];
    private int salleCount = 0;
    private int prescripteurCount = 0;
    private int radialogueCount = 0;
    private int technitienCount = 0;

    public CentreRadialogue(String nom, String adresse, double revenu, double depence, Agenda agenda) {
        this.nom = nom;
        this.adresse = adresse;
        this.revenu = revenu;
        this.depence = depence;
        this.agenda = agenda;
        this.tabsalleExamens = new SalleExamen[100];
        this.tabmedecinPrescripteurs = new MedecinPrescripteur[100];
        this.tabmedecinRadialogues = new MedecinRadialogue[100];
        this.tabtechnitiens = new Technitien[100];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getRevenu() {
        return revenu;
    }

    public void setRevenu(double revenu) {
        this.revenu = revenu;
    }

    public double getDepence() {
        return depence;
    }

    public void setDepence(double depence) {
        this.depence = depence;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public SalleExamen[] getTabsalleExamens() {
        return tabsalleExamens;
    }

    public void setTabsalleExamens(SalleExamen[] tabsalleExamens) {
        this.tabsalleExamens = tabsalleExamens;
    }

    public MedecinPrescripteur[] getTabmedecinPrescripteurs() {
        return tabmedecinPrescripteurs;
    }

    public void setTabmedecinPrescripteurs(MedecinPrescripteur[] tabmedecinPrescripteurs) {
        this.tabmedecinPrescripteurs = tabmedecinPrescripteurs;
    }

    public MedecinRadialogue[] getTabmedecinRadialogues() {
        return tabmedecinRadialogues;
    }

    public void setTabmedecinRadialogues(MedecinRadialogue[] tabmedecinRadialogues) {
        this.tabmedecinRadialogues = tabmedecinRadialogues;
    }

    public Technitien[] getTabtechnitiens() {
        return tabtechnitiens;
    }

    public void setTabtechnitiens(Technitien[] tabtechnitiens) {
        this.tabtechnitiens = tabtechnitiens;
    }

    public int getSalleCount() {
        return salleCount;
    }

    public void setSalleCount(int salleCount) {
        this.salleCount = salleCount;
    }

    public int getPrescripteurCount() {
        return prescripteurCount;
    }

    public void setPrescripteurCount(int prescripteurCount) {
        this.prescripteurCount = prescripteurCount;
    }

    public int getRadialogueCount() {
        return radialogueCount;
    }

    public void setRadialogueCount(int radialogueCount) {
        this.radialogueCount = radialogueCount;
    }

    public int getTechnitienCount() {
        return technitienCount;
    }

    public void setTechnitienCount(int technitienCount) {
        this.technitienCount = technitienCount;
    }
    

    

    


}
>>>>>>> 1a433453e040eb56ba5b181ccf2a57c438255ac6
