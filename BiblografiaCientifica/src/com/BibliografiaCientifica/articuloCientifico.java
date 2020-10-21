
package AlmacenBibliografico;


public class articuloCientifico {
    String titulo;
    String tema;
    String autores;
    String palabrasClave;
    String lugarResguardo;
    boolean copia;

    public articuloCientifico(){
    }
    public String getTitulo() {
        return titulo;
    }
     public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }
     public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAutores() {
        return autores;
    }
     public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getPalabrasClave() {
        return palabrasClave;
    }
     public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public String getLugarResguardo() {
        return lugarResguardo;
    }
   
    public void setLugarResguardo(String lugarResguardo) {
        this.lugarResguardo = lugarResguardo;
    } 

    public boolean isCopia() {
        return copia;
    }
    public void setCopia(boolean copia) {
        this.copia = copia;
    }
   
    
    
    
    
            
}
