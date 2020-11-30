package mipaquete;

public class Trabajo{

    private int id;
    private int claveTrabajo;
    private Persona empleado;

    public Trabajo(int id,int clave, Persona persona){
        this.id = id;
        this.claveTrabajo = clave;
        this.empleado = persona;
    }
}