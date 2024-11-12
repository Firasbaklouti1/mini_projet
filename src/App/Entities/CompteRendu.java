package App.Entities;
import java.PdfDocument;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;


public class CompteRendu {
    private MedecinPrescripteur medecinPrescripteur;
    private PdfDocument ordonnance;
    private ExamenRadialoque examenRadialoque;
    public CompteRendu(MedecinPrescripteur medecinPrescripteur, PdfDocument ordonnance,
            ExamenRadialoque examenRadialoque) {
        this.medecinPrescripteur = medecinPrescripteur;
        this.PdfDocument = ordonnance;
        this.examenRadialoque = examenRadialoque;
    }
    
    

}
