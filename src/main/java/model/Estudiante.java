package model;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String rut;
    private String nMatricula;

    public Estudiante(String nombre, String apellido, String rut, String nMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.nMatricula = nMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    public String getnMatricula() {
        return nMatricula;
    }

    @Override
     public String toString(){
        return "Nombre: "+this.nombre+" "+this.apellido+", rut: "+this.rut+", número de matricula "+this.nMatricula;
    }
}