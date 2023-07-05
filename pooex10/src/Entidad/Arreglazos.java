/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jupac
 */
public class Arreglazos {
    
    private double[] arregloA=new double[50];
    private double[] arregloB=new double[20];

    public Arreglazos() {
        System.out.println("El arreglo A se inicializa: ");
        System.out.println("-");
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i]=Math.random();
            System.out.print("["+arregloA[i]+"]");
        }
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }
    
    
    
    
    
}
