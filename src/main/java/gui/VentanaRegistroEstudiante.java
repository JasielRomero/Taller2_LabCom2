package gui;

import model.Estudiante;

import javax.swing.*;
import javax.swing.text.InternationalFormatter;
import java.awt.event.ActionEvent;

public class VentanaRegistroEstudiante extends Ventana {
    private JLabel textoEncabezado, textoRut, textoNombre, textoApellido, textoNMatricula;
    private JTextField campoRut, campoNombre, campoApellido, campoNMatricula;
    private JButton botonRegistrar, botonCancelar;
    private Estudiante estudiante;


    public VentanaRegistroEstudiante(Estudiante estudiante) {
        super("Registro de Estudiante", 500, 520);
        this.estudiante = estudiante;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonCancelar();
        generarBotonRegistrar();
        generarCampoApellido();
        generarCampoNombre();
        generarCampoNMatricula();
        generarCampoRut();
    }

    private void generarEncabezado() {
        String textoCabecera = "Registro de Estudiante";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);

    }

    private void generarBotonRegistrar() {
        String textoBoton = "Registrar Estudiante";
        this.botonRegistrar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonRegistrar);
        this.botonRegistrar.addActionListener(this);
    }

    private void generarBotonCancelar() {
        String textoBotonCancelar = "Cancelar";
        this.botonCancelar = super.generarBoton(textoBotonCancelar, 275, 400, 150, 20);
        this.add(this.botonCancelar);
        this.botonCancelar.addActionListener(this);
    }

    private void generarCampoNombre() {
        String textoNombre = "Nombre:";
        super.generarJLabel(this.textoNombre, textoNombre, 20, 50, 150, 20);
        this.campoNombre = super.generarJTextField(200, 50, 250, 20);
        this.add(this.campoNombre);
    }

    private void generarCampoRut() {
        String textoRut = "Rut:";
        super.generarJLabel(this.textoRut, textoRut, 20, 100, 150, 20);
        this.campoRut = super.generarJTextField(200, 100, 250, 20);
        this.add(this.campoRut);
    }

    private void generarCampoApellido() {
        String textoDireccion = "Apellido:";
        super.generarJLabel(this.textoApellido, textoApellido, 20, 150, 150, 20);
        this.campoApellido = super.generarJTextField(200, 150, 250, 20);
        this.add(this.campoApellido);
    }

    private void generarCampoNMatricula() {
        String textoNumero = "Número de Matricula:";
        super.generarJLabel(this.textoNMatricula, textoNumero, 20, 250, 150, 20);
        this.campoNMatricula = super.generarJTextField(200, 250, 250, 20);
        this.add(this.campoNMatricula);
    }

    private boolean registrarCliente() {
        return estudiante.añadirEstudiante(this.campoNombre.getText(), this.campoApellido.getText(), this.campoNMatricula.getText(), this.campoRut.getText());
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonRegistrar) {
            if (registrarCliente()) {
                JOptionPane.showMessageDialog(this, "Cliente registrado correctamente");
                VentanaBienvenida ventanaMenuBienvenida = new VentanaBienvenida(estudiante);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un rut válido");
            }

        }
        if (e.getSource() == this.botonCancelar) {
            VentanaBienvenida ventanaMenuBienvenida = new VentanaBienvenida(estudiante);
            this.dispose();
        }

    }

}
