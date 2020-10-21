
package AlmacenBibliografico;


public class actaCongreso extends autor{
    String nombreCongreso;
    int edicionDePresentacion;
    String ciudad;
    String fechaInicio;
    String fechaFin;
    boolean nacional;
    String frecuencia;
    
    public actaCongreso(){
    }

    public String getNombreCongreso() {
        return nombreCongreso;
    }

    public int getEdicionDePresentacion() {
        return edicionDePresentacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public boolean isNacional() {
        return nacional;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setNombreCongreso(String nombreCongreso) {
        this.nombreCongreso = nombreCongreso;
    }

    public void setEdicionDePresentacion(int edicionDePresentacion) {
        this.edicionDePresentacion = edicionDePresentacion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    
    
    
}
