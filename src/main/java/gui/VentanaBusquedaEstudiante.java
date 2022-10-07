package gui;

import model.Estudiante;
import model.CarrerasEstudiante;
import model.Carrera;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class VentanaBusquedaEstudiante extends Ventana {
    private JButton botonBuscar, botonRegresar;
    private JLabel textoEncabezado, textoNombre, textoMarca;
    private JComboBox listaCarrera;
    private JTextField campoNombre;
    private Estudiante estudiante;

    public VentanaBusquedaEstudiante(Estudiante estudiante) {
        super("Búsqueda de Vehículo", 500, 520);
        this.estudiante= estudiante;
        generarElementosVentana();
    }
    private void generarElementosVentana() {
        generarCampoNombre();
        generarBotonBuscarEstudiante();
        generarBotonCancelar();
       // generarListaMarcaVehiculo();
    }
    private void generarCampoNombre(){
        String textoNombre= "Nombre Estudiante:";
        super.generarJLabel(this.textoNombre,textoNombre,20,50,150,20);
        this.campoNombre= super.generarJTextField(200,50,250,20);
        this.add(this.campoNombre);
    }
    private void generarListaCarrerasEstudiante(){
        super.generarJLabel(this.textoMarca,"Marca vehículo:",20,100,100,20);
        this.listaCarrera=super.generarListaDesplegable(CarrerasEstudiante.values(),120,100, 100, 20);
        this.add(this.listaCarrera);
    }
    private void generarBotonBuscarEstudiante() {
        String textoBoton= "Buscar Estudiante";
        this.botonBuscar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonBuscar);
        this.botonBuscar.addActionListener(this);
    }
    private void generarBotonCancelar() {
        String textoBotonRegresar = "Regresar";
        this.botonRegresar = super.generarBoton(textoBotonRegresar, 275, 400, 150, 20);
        this.add(this.botonRegresar);
        this.botonRegresar.addActionListener(this);
    }
    private String[][] registrarEstudiante(){
        List<Estudiante> estudiante= new ArrayList<>();
        String[][] datosEstudiantes;
        if(this.campoNombre.getText().length()==0){
            System.out.println(this.listaCarrera.getSelectedItem());
            generarListaCarrerasEstudiante();=  estudiante.add((CarrerasEstudiante) this.listaCarrera.getSelectedItem());
        }
        else{
            Estudiante= Carrera.buscarEstudianteNombre(this.campoNombre.getText());
        }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.botonBuscar){
            String[] nombreColumnas={"Nombre","Apellido","Rut","Numero de Matricula"};
            VentanaTabla ventanaTabla= new VentanaTabla(registrarEstudiante(),nombreColumnas);
        }
        if (e.getSource() == this.botonRegresar){
            VentanaBienvenida ventanaMenuBienvenida = new VentanaBienvenida(estudiante);
            this.dispose();
        }

    }
}