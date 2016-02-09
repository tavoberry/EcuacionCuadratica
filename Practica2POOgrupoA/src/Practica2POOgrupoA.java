
import controlador.ControladorVentanaEcuacion;
import modelo.EcuacionCuadratica;
import vista.VentanaEcuacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tavoberry
 */
public class Practica2POOgrupoA {
    public static void main(String []arg){
        VentanaEcuacion ventana = new VentanaEcuacion();
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(0,0,0);
        ControladorVentanaEcuacion controlador = new ControladorVentanaEcuacion(ecuacion,ventana);
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
