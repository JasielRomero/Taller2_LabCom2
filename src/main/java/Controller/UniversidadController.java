package Controller;

import model.Carrera;
import model.CarrerasEstudiante;
import model.Estudiante;

import java.util.List;

public class UniversidadController {
    public static List buscarEstudiante(Estudiante estudiante, String nombre){
        return estudiante.buscarEstudianteNombre(nombre);
    }
    public static boolean agregarEstudiante(Estudiante estudiante, String nombre, String apellido, String rut,
                                            String nMatricula){
        return estudiante.añadirEstudiante(nombre,apellido,rut,nMatricula);
    }
    public static boolean removerEstudiante(Estudiante estudiante, String nombre, String apellido, String rut, String nMatricula){
        return estudiante.removerEstudiante(nombre, apellido, rut, nMatricula);
    }
    public static List buscarCarrera(Carrera carrera, String nombre){
        return carrera.buscarEstudiantesCarrera(CarrerasEstudiante.valueOf(nombre));
    }
    public static Carrera agregarCarrera(Carrera carrera, String nombre, String codigo, String cantidadSemestres){
        return carrera.añadirCarrera(nombre,codigo,cantidadSemestres);
    }
    public static boolean removerCarrera(Carrera carrera, String nombre, String codigo, String cantidadSemestres){
        UniversidadController estudiante = new UniversidadController();
        return estudiante.removerEstudiante(nombre, codigo, cantidadSemestres);
    }

    public static void almacenarDatos(Estudiante estudiante) {
    }
}