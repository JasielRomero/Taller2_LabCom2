package gui;

import model.Estudiante;
import model.Carrera;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class VentanaBusquedaEstudiante extends VentanaBienvenida  {
    private JButton botonBuscar, botonRegresar;
    private JLabel textoEncabezado, textoNombre;
    private JComboBox listaCarrera;
    private JTextField campoNombre;
    private Estudiante estudiante;

    public VentanaBusquedaEstudiante(Estudiante estudiante) {
        super("Búsqueda de Estudiante", 500, 520);
        this.estudiante = estudiante;
        generarElementosVentana();
    }
    private void generarElementosVentana() {
        generarCampoNombre();
        generarBotonBuscarEstudiante();
        generarBotonCancelar();
        generarListaEstudiante();
    }
    private void generarCampoNombre(){
        String textoNombre= "Nombre del estudiante:";
        super.generarJLabel(this.textoNombre,textoNombre,20,50,150,20);
        this.campoNombre= super.generarJTextField(200,50,250,20);
        this.add(this.campoNombre);
    }
    private void generarListaCarrera(){
        super.generarJLabel(this.textoCarrera,"Carrera:",20,100,100,20);
        this.listaCarrera=super.generarListaDesplegable(new Estudiante(),120,100, 100, 20);
        this.add(this.carrerasEstudiante);
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

}
