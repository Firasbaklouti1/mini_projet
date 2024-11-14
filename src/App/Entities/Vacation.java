package App.Entities;


public class Vacation {
    private SalleExamen[] tabsalleExamensdisp;
    private MedecinPrescripteur[] tabmedecinPrescripteursdisp;
    private MedecinRadialogue[] tabmedecinRadialoguesdisp;
    private Date date;
    private RendezVous[] rendezVous;
    private int salleExamenCount = 0;
    private int medecinPrescripteurCount = 0;
    private int medecinRadialogueCount = 0;
    private int rendezVousCount = 0;

    public Vacation(Date date) {
        this.tabsalleExamensdisp = new SalleExamen[100];
        this.tabmedecinPrescripteursdisp = new MedecinPrescripteur[100];
        this.tabmedecinRadialoguesdisp = new MedecinRadialogue[100];
        this.rendezVous = new RendezVous[100];
        this.date = date;
    }

    public SalleExamen[] getTabsalleExamensdisp() {
        return tabsalleExamensdisp;
    }

    public void setTabsalleExamensdisp(SalleExamen[] tabsalleExamensdisp) {
        this.tabsalleExamensdisp = tabsalleExamensdisp;
    }

    public MedecinPrescripteur[] getTabmedecinPrescripteursdisp() {
        return tabmedecinPrescripteursdisp;
    }

    public void setTabmedecinPrescripteursdisp(MedecinPrescripteur[] tabmedecinPrescripteursdisp) {
        this.tabmedecinPrescripteursdisp = tabmedecinPrescripteursdisp;
    }

    public MedecinRadialogue[] getTabmedecinRadialoguesdisp() {
        return tabmedecinRadialoguesdisp;
    }

    public void setTabmedecinRadialoguesdisp(MedecinRadialogue[] tabmedecinRadialoguesdisp) {
        this.tabmedecinRadialoguesdisp = tabmedecinRadialoguesdisp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public RendezVous[] getRendezVous() {
        return rendezVous;
    }

    public void setRendezVous(RendezVous[] rendezVous) {
        this.rendezVous = rendezVous;
    }

    public int getSalleExamenCount() {
        return salleExamenCount;
    }

    public void setSalleExamenCount(int salleExamenCount) {
        this.salleExamenCount = salleExamenCount;
    }

    public int getMedecinPrescripteurCount() {
        return medecinPrescripteurCount;
    }

    public void setMedecinPrescripteurCount(int medecinPrescripteurCount) {
        this.medecinPrescripteurCount = medecinPrescripteurCount;
    }

    public int getMedecinRadialogueCount() {
        return medecinRadialogueCount;
    }

    public void setMedecinRadialogueCount(int medecinRadialogueCount) {
        this.medecinRadialogueCount = medecinRadialogueCount;
    }

    public int getRendezVousCount() {
        return rendezVousCount;
    }

    public void setRendezVousCount(int rendezVousCount) {
        this.rendezVousCount = rendezVousCount;
    }

    

    

}

