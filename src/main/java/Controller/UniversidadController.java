package Controller;

import model.Carrera;
import model.Estudiante;
import model.CarrerasEstudiante;

import java.util.List;

public class UniversidadController {
    public static List buscarEstudiante(Estudiante estudiante, String nombre){
        return estudiante.buscarEstudianteNombre(nombre);
    }
    public static Vehiculo agregarVehiculo(Automotora automotora, String nombre, ColorVehiculo color, MarcaVehiculo marca,
                                           int año, int precio, double kmRecorridos){
        return automotora.añadirVehiculo(nombre,color,marca,año,precio,kmRecorridos);
    }
    public static boolean removerVehiculo(Automotora automotora, String nombre, int año){
        return automotora.removerVehiculo(nombre,año);
    }
    public static void almacenarDatos(Automotora automotora){
        GestorDatos.registrarDatos(automotora.getClientes(),"clientes.txt");
        GestorDatos.registrarDatos(automotora.getVendedores(),"vendedores.txt");
        GestorDatos.registrarDatos(automotora.getVehiculosAVenta(),"vehiculos.txt");
    }
}