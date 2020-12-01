package mipaquete;

public class Trabajo{

    private int id;
    private int claveTrabajo;
    private Persona empleado;
    private String description;

    public Trabajo(int id,int clave, Persona persona, String des){
        this.id = id;
        this.claveTrabajo = clave;
        this.empleado = persona;
        this.description = des;
    }
}