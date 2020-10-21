
package AlmacenBibliografico;


public class autor extends articuloCientifico{
    String nombre;
    String aPaterno;
    String aMaterno;
    String centroDeTrabajo;
    String correo;
    String temasDeTrabajo;

    public autor(){
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }
    
    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
    
    public String getCentroDeTrabajo() {
        return centroDeTrabajo;
    }

    public void setCentroDeTrabajo(String centroDeTrabajo) {
        this.centroDeTrabajo = centroDeTrabajo;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getTemasDeTrabajo() {
        return temasDeTrabajo;
    }

    public void setTemasDeTrabajo(String temasDeTrabajo) {
        this.temasDeTrabajo = temasDeTrabajo;
    }
    
    void agregarAutor(){
        
    }
    void agregarDocumento(){
    
    }
    
}
