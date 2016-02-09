/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.EcuacionCuadratica;
import vista.VentanaEcuacion;

/**
 *
 * @author tavoberry
 */
public class ControladorVentanaEcuacion implements ActionListener{
    //Atributos
    EcuacionCuadratica ecuacion = new EcuacionCuadratica(0,0,0);
    VentanaEcuacion ventana = new VentanaEcuacion();
    
    //constructor de la clase
    public ControladorVentanaEcuacion(EcuacionCuadratica ecuacion, 
            VentanaEcuacion ventana){
        this.ventana = ventana;
        this.ecuacion = ecuacion;
        ventana.btnObtener.addActionListener(this);
        ventana.btnResolver.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==ventana.btnObtener){
            ecuacion.setA(Integer.parseInt(ventana.txtA.getText()));
            ecuacion.setB(Integer.parseInt(ventana.txtB.getText()));
            ecuacion.setC(Integer.parseInt(ventana.txtC.getText()));
            ventana.lblX1.setText("x1 = "+ecuacion.calcularX1());
            ventana.lblX2.setText("x2 = "+ecuacion.calcularX2());
        }
        if (e.getSource()==ventana.btnResolver){
            ecuacion.setA(Integer.parseInt(ventana.txtA.getText()));
            ecuacion.setB(Integer.parseInt(ventana.txtB.getText()));
            ecuacion.setC(Integer.parseInt(ventana.txtC.getText()));
            ventana.lblResultado.setText("Resultado de la ecuación para X1 = "+
                    ecuacion.resolverEcuacion(ecuacion.getX1()));
            ventana.lblResultado2.setText("Resultado de la ecuación para X2 = "+
                    ecuacion.resolverEcuacion(ecuacion.getX2()));
        }
    }
}
