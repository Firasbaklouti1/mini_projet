package App.Entities;

public class CentreRadialogue {
    private String nom;
    private String adresse;
    private double revenu;
    private double depence;
    private double revenuNet;
    private Agenda agenda;
    private SalleExamen [] tabsalleExamens=new SalleExamen[100];
    private MedecinPrescripteur[] tabmedecinPrescripteurs=new MedecinPrescripteur[100];
    private MedecinRadialogue [] tabmedecinRadialogues=new MedecinRadialogue[100];
    private Technitien [] tabtechnitiens=new Technitien[100];
    public CentreRadialogue(String nom, String adresse, double revenu, double depence, double revenuNet, Agenda agenda,
            SalleExamen[] tabsalleExamens, MedecinPrescripteur[] tabmedecinPrescripteurs,
            MedecinRadialogue[] tabmedecinRadialogues, Technitien[] tabtechnitiens) {
        this.nom = nom;
        this.adresse = adresse;
        this.revenu = revenu;
        this.depence = depence;
        this.revenuNet = revenuNet;
        this.agenda = agenda;
        this.tabsalleExamens = tabsalleExamens;
        this.tabmedecinPrescripteurs = tabmedecinPrescripteurs;
        this.tabmedecinRadialogues = tabmedecinRadialogues;
        this.tabtechnitiens = tabtechnitiens;
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
    public double getRevenuNet() {
        return revenuNet;
    }
    public void setRevenuNet(double revenuNet) {
        this.revenuNet = revenuNet;
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
    


}
