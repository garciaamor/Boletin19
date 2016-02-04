package boletin19;

public class Correo {
    String contido="Prueba de correo";
    boolean leido;

    public Correo(String contido, boolean leido) {
        this.contido = contido;
        this.leido = leido;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    

    @Override
    public String toString() {
        return "Correo{" + "contido=" + contido + ", leido=" + leido + '}';
    }
    
    
}
