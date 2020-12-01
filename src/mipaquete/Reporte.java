package mipaquete;

public class Reporte{
    private String codigoReporte;
    private Persona empleadoReporta;
    private Trabajo trabajo;

    public Reporte(){

    }

    public Trabajo getTrabrajo(){
        return this.trabajo;
    }
}