package model;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private String codigo;
    private String cantidadSemestres;

    public Carrera(String nombre, String codigo, String cantidadSemestres) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadSemestres = cantidadSemestres;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidadSemestres() {
        return cantidadSemestres;
    }

    public void setCantidadSemestres(String cantidadSemestres) {
        this.cantidadSemestres = cantidadSemestres;
    }


    private List<Carrera> carrerasEstudiantes;

    public List<Carrera> buscarEstudiantesCarrera(CarrerasEstudiante carrera) {
        List<Carrera> carrera2 = new ArrayList<Carrera>();
        for (Carrera carrera1 : this.carrerasEstudiantes) {
            if (carrera1.getNombre().equals(nombre)) {
                carrera2.add(carrera1);
            }
        }
        return carrera2;
    }
    private List<Estudiante> estudiantes;

    public Carrera(){
        this.estudiantes = new ArrayList<>();
    }
    public boolean agregarEstudiante(String nombre, String apellido, String rut, String nMatricula){
        if(buscarEstudiante(rut,nombre) == null) {
            Estudiante estudiante = new Estudiante(nombre, apellido, rut, nMatricula);
            this.estudiantes.add(estudiante);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean agregarEstudiante(Estudiante estudiante){
        if(buscarEstudiante(estudiante.getRut(),estudiante.getNombre()) == null){
            this.estudiantes.add(estudiante);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean eliminarEstudiante(String rut, String nombre){
        Estudiante estudiante= this.buscarEstudiante(rut,nombre);
        if(estudiante != null){
            this.estudiantes.remove(estudiantes);
            return true;
        }
        else {
            return false;
        }
    }

    public Estudiante buscarEstudiante(String rut, String nombre){
        for(Estudiante estudiante : this.estudiantes){
            if(estudiante.getNombre().equals(nombre) && estudiante.getRut().equals(rut)){
                return estudiante;
            }
        }
        return null;
    }
    public List buscarEstudiantes(String nombre){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        for(Estudiante estudiante : this.estudiantes){
            if(estudiante.getNombre().equals(nombre)){
                estudiantes.add(estudiante);
            }
        }
        return estudiantes;
    }

    public void mostrarEstudiante(){
        for(Estudiante estudiante : this.estudiantes){
            System.out.println(estudiante.toString());
        }
    }

    public void mostrarEstudiante(List<Estudiante> estudiantes){
        for(Estudiante estudiante : estudiantes){
            System.out.println(estudiante.toString());
        }
    }

}

