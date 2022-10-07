package gui;

import model.Carrera;
import model.Estudiante;
import model.CarrerasEstudiante;

import javax.swing.*;
import javax.swing.text.InternationalFormatter;
import java.awt.event.ActionEvent;

public class VentanaRegistroCarrera extends Ventana {
    private JLabel textoEncabezado, textoMarcaVehiculo, textoNombre, textoColorVehiculo, textoAñoVehiculo, textoPrecioVehiculo, textoKmRecorridos;
    private JTextField campoRut, campoNombre, campoDireccion, campoNumeroTelefonico, campoCorreo;
    private JButton botonRegistrar, botonCancelar;
    private JFormattedTextField campoAñoVehiculo, campoPrecioVehiculo, campoKmRecorridos;
    private JComboBox listaMarcaVehiculo, listacolorVehiculo;
    private Carrera carrera;
    private void generarEncabezado() {
        String textoCabecera = "Registro de Carrera";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);

    }
    public VentanaRegistroCarrera(Carrera carrera){
        super("Registro de Carrera Universitaria", 500, 520);
        this.carrera= carrera;

    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.botonRegistrar){
            if(registrarCarrera()){
                Estudiante.añadirCarrera(this.campoNombre.getText(), Integer.parseInt(this.campoCodigo.getText()),Integer.parseInt(this.campocantidadSemestre.getText()));
                JOptionPane.showMessageDialog(this,"Carrera registrada correctamente","Mensaje de confirmación",
                        JOptionPane.INFORMATION_MESSAGE);
                VentanaBienvenida ventanaBienvenida = new VentanaBienvenida(carrera);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"Complete todos los datos", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == this.botonCancelar){
            VentanaBienvenida ventanaBienvenida = new VentanaBienvenida(carrera);
            this.dispose();
        }

    }
}
