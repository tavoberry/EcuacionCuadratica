
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
        VentanaEcuacion v; //Declarar el objeto v
        v = new VentanaEcuacion(); //Instanciar la clase
        EcuacionCuadratica ec = new EcuacionCuadratica(0,0,0);
        ControladorVentanaEcuacion ctr = new ControladorVentanaEcuacion(ec,v);
        
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }
}
