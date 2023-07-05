/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class Circunferencia {
    private static double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public static void crearCircunferencia(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio=leer.nextDouble();
    }
    
    public static double area(double radio){
         return (Math.PI*(Math.pow(radio, 2)));
         
    }
    
    public static double perimetro(double radio){
    return 2*Math.PI*radio;
    
    }
    
}
