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
public class Operacion {
    private static int numero1;
    private static int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public static void crearOperacion(){
        Scanner leer=new Scanner(System.in);
        numero1=leer.nextInt();
        numero2=leer.nextInt();
        
    }
    
    public static int sumar(){
        return numero1+numero2;
    }
    
    public static int restar(){
        return numero1-numero2;
    }
    
    public static int multiplicar(){
        if(numero1!=0 || numero2!=0){
            return numero1*numero2;
        }else{
            System.out.println("Los numeros deben ser distintos de 0");
            return 0;
        }
    }
    
    public static double dividir(){
        if(numero1!=0 || numero2!=0){
            return numero1/numero2;
        }else{
            System.out.println("Los numeros deben ser distintos de 0 para dividir");
            return 0;
        }
    }
    
}
