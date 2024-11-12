package App.Entities;

public class SalleExamen {
    private int numSalle;
    private String nomSalle;
    private String techniqueAcquisitionpe;
    public SalleExamen(int numSalle, String nomSalle, String techniqueAcquisitionpe) {
        this.numSalle = numSalle;
        this.nomSalle = nomSalle;
        this.techniqueAcquisitionpe = techniqueAcquisitionpe;
    }
    public int getNumSalle() {
        return numSalle;
    }
    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }
    public String getNomSalle() {
        return nomSalle;
    }
    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }
    public String gettechniqueAcquisitionpe() {
        return techniqueAcquisitionpe;
    }
    public void settechniqueAcquisitionpe(String techniqueAcquisitionpe) {
        this.techniqueAcquisitionpe = techniqueAcquisitionpe;
    }
    
}
