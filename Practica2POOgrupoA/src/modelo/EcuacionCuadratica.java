/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tavoberry
 */
public class EcuacionCuadratica {
    //Atributos
    private int a;
    private int b;
    private int c;
    private float x1;
    private float x2;
    
    //Constructor de la clase
    public EcuacionCuadratica(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        x1=0;
        x2=0;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * @return the x1
     */
    public float getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(float x1) {
        this.x1 = x1;
    }

    /**
     * @return the x2
     */
    public float getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(float x2) {
        this.x2 = x2;
    }
    
    /**
     * Obtiene el valor de X1 
     * @return el valor de X1
     */
    public float calcularX1(){
        float aux=0;
        aux = (float) Math.sqrt(Math.pow(b, 2)-4*a*c);
        x1 = (-b + aux)/(2*a);
        return x1;
    }
    
    /**
     * Obtiene el valor de X2 
     * @return regresa el valor de X2
     */
    public float calcularX2(){
        float aux=0;
        aux =  (float) Math.sqrt(Math.pow(b, 2)-4*a*c);
        x2 = (-b - aux)/(2*a);
        return x2;
    }
    
    /**
     * Calcula el valor de la ecuación cuadrática
     * @param x el valor para x
     * @return el valor de la ecuación
     */
    public float resolverEcuacion(float x){
        return (float) (a*Math.pow(x, 2)+b*x+c);
    }
}
