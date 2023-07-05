/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Arreglazos;
import java.util.Arrays;

/**
 *
 * @author jupac
 */
public class ServicioArreglazos {
    
   
    
    public static double [] ordenarArreglo(){
        Arreglazos arreglA=new Arreglazos();
        double[] modificado=arreglA.getArregloA();
        Arrays.sort(modificado);
        imprimirA(modificado);
        llenarB(modificado, arreglA.getArregloB());
        return modificado;
    }
    
    public static double [] llenarB(double [] arregloA,double [] arregloB){
        for (int i = 0; i < 10; i++) {
            arregloB[i]=arregloA[i];
        }
        
        for (int i = 10; i <arregloB.length; i++) {
            arregloB[i]=0.5;
        }
        
        imprimirB(arregloB);
        return arregloB;
    }
    
    public static void imprimirA(double[] arreglo){
        System.out.println("El arreglo A es: ");
        System.out.println("");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
           
        }
        System.out.println("");
    }
    
    public static void imprimirB(double[] arreglo){
        System.out.println("El arreglo B es: ");
        System.out.println("");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println("");
    }
}
