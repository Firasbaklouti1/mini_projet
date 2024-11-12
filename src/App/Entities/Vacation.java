package App.Entities;

public class Vacation {
    private SalleExamen [] tabsalleExamensdisp=new SalleExamen[100];
    private MedecinPrescripteur[] tabmedecinPrescripteursdisp=new MedecinPrescripteur[100];
    private MedecinRadialogue [] tabmedecinRadialoguesdisp=new MedecinRadialogue[100];
    private Date date;
    private RendezVous [] rendezVous =new RendezVous[100];
    public Vacation(SalleExamen[] tabsalleExamensdisp, MedecinPrescripteur[] tabmedecinPrescripteursdisp,
            MedecinRadialogue[] tabmedecinRadialoguesdisp, Date date, RendezVous[] rendezVous) {
        this.tabsalleExamensdisp = tabsalleExamensdisp;
        this.tabmedecinPrescripteursdisp = tabmedecinPrescripteursdisp;
        this.tabmedecinRadialoguesdisp = tabmedecinRadialoguesdisp;
        this.date = date;
        this.rendezVous = rendezVous;
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
    
    
}
