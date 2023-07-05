/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class Rectangulo {
    public static int base;
    public static int altura;

    public Rectangulo() {
        
    }
    
    

    
    
    public static int getBase() {
        return base;
    }

    public static void setBase(int base) {
        Rectangulo.base = base;
    }

    public static int getAltura() {
        return altura;
    }

    public static void setAltura(int altura) {
        Rectangulo.altura = altura;
    }
    
    
    /**
     * Apartado de funcionas para la creacion y dibujado del rectangulo
     */
    public static void crearRectangulo(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la base seguida de la altura");
        base=leer.nextInt();
        altura=leer.nextInt();
    }
    
    public static int calcularSuperficie(){
        return base*altura;
    }
    
    public static int perimetro(){
        return (base+altura)*2;
    }
    public static void dibujar(){
        for (int i = 0; i <altura; i++) {
            for (int j = 0; j <base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
