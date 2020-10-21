
package AlmacenBibliografico;

public class informeTecnico extends autor{
    int numeroInforme;
    String centroQuePublica;
    String mesAñoDePublicacion;
    
    public informeTecnico(){
    }

    public int getNumeroInforme() {
        return numeroInforme;
    }

    public String getCentroQuePublica() {
        return centroQuePublica;
    }

    public String getMesAñoDePublicacion() {
        return mesAñoDePublicacion;
    }

    public void setNumeroInforme(int numeroInforme) {
        this.numeroInforme = numeroInforme;
    }

    public void setCentroQuePublica(String centroQuePublica) {
        this.centroQuePublica = centroQuePublica;
    }

    public void setMesAñoDePublicacion(String mesAñoDePublicacion) {
        this.mesAñoDePublicacion = mesAñoDePublicacion;
    }
    
    
    
}
