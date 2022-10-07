package gui;

import Controller.UniversidadController;
import model.Estudiante;
import model.Carrera;
import gui.*;

import javax.swing.*;
import java.awt.event.*;

public class VentanaBienvenida extends Ventana {

    private JLabel textoMenu;
    private JButton botonRegistrarCarrera;
    private JButton botonSalida;
    private JButton botonRegistrarEstudiante;
    private JButton botonBuscarEstudiante;
    private Estudiante estudiante;

    public VentanaBienvenida(Estudiante estudiante) {
        super("Menu Intranet", 500, 520);
        this.estudiante=estudiante;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeMenu();
        generarBotonRegistrarCarrera();
        generarBotonRegistrarEstudiante();
        generarBotonBuscarEstudiante();
        generarBotonSalir();
    }

    private void generarMensajeMenu() {
        String textoBienvenida = "Intranet 2.0";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 20, 30, 500, 30);
    }

    private void generarBotonRegistrarCarrera() {
        String textoBoton = "Registrar Carrera";
        this.botonRegistrarCarrera = super.generarBoton(textoBoton, 175, 100, 150, 40);
        this.add(this.botonRegistrarCarrera);
        this.botonRegistrarCarrera.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }
    private void generarBotonRegistrarEstudiante() {
        String textoBoton = "Registrar Estudiante";
        this.botonRegistrarEstudiante = super.generarBoton(textoBoton, 175, 180, 150, 40);
        this.add(this.botonRegistrarEstudiante);
        this.botonRegistrarEstudiante.addActionListener(this);
    }
    private void generarBotonBuscarEstudiante(){
        String textoBoton = "Buscar Estudiante";
        this.botonBuscarEstudiante=super.generarBoton(textoBoton, 175, 260, 150, 40);
        this.add(this.botonBuscarEstudiante);
        this.botonBuscarEstudiante.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonRegistrarCarrera) {
            VentanaRegistroCarrera ventanaRegistroCarrera= new VentanaRegistroCarrera(estudiante);
            this.dispose();
        }
        if(e.getSource() == this.botonRegistrarEstudiante){
            VentanaRegistroEstudiante ventanaRegistroEstudiante= new VentanaRegistroEstudiante(estudiante);
            this.dispose();
        }
        if(e.getSource() == this.botonBuscarEstudiante){
            VentanaBusquedaEstudiante ventanaBusquedaEstudiante= new VentanaBusquedaEstudiante(estudiante);
            this.dispose();
        }

        if(e.getSource() == this.botonSalida){
            UniversidadController.almacenarDatos(this.estudiante);
            this.dispose();
            System.exit(0);
        }

    }
}

