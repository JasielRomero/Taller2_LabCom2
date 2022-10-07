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
    }

    private void generarCampoNombre() {
        String textoNombre = "Nombre Estudiante:";
        super.generarJLabel(this.textoNombre, textoNombre, 20, 50, 150, 20);
        this.campoNombre = super.generarJTextField(200, 50, 250, 20);
        this.add(this.campoNombre);
    }

    private void generarBotonBuscarEstudiante() {
        String textoBoton = "Buscar Estudiante";
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

    private <actionPerformed> String[][] registrarEstudiante() {
        List<CarrerasEstudiante> estudiante = new ArrayList<>();
        String[][] datosEstudiantes;
        if (this.campoNombre.getText().length() == 0) {
            System.out.println(this.listaCarrera.getSelectedItem());
            generarListaCarrerasEstudiante() = estudiante.add((CarrerasEstudiante) this.listaCarrera.getSelectedItem());
        } else {
            Estudiante = Carrera.buscarEstudianteNombre(this.campoNombre.getText());
        }
        public actionPerformed;
        (ActionEvent)
        if (e.getSource() == this.botonBuscar) {
            String[] nombreColumnas = {"Nombre", "Apellido", "Rut", "Numero de Matricula"};
            VentanaTabla ventanaTabla = new VentanaTabla(registrarEstudiante(), nombreColumnas);
        }
        if (e.getSource() == this.botonRegresar) {
            VentanaBienvenida ventanaBienvenida = new VentanaBienvenida((Estudiante) estudiante);
            this.dispose();
        }

    }

    private boolean generarListaCarrerasEstudiante() {
        return false;
    }
}

