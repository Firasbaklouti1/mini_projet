package App.Entities;


public class RendezVous {
    private ExamenRadialoque examenRadialoque;
    private Date date;
    private int tempDebut;
    private Patient patient;
    public RendezVous(ExamenRadialoque examenRadialoque, Date date, Patient patient,int tempDebut) {
        this.examenRadialoque = examenRadialoque;
        this.date = date;
        this.patient = patient;
        this.tempDebut=tempDebut;
    }
    
    public ExamenRadialoque getExamenRadialoque() {
        return examenRadialoque;
    }
    public void setExamenRadialoque(ExamenRadialoque examenRadialoque) {
        this.examenRadialoque = examenRadialoque;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getTempDebut() {
        return tempDebut;
    }

    public void setTempDebut(int tempDebut) {
        this.tempDebut = tempDebut;
    }
    

   
    

}
