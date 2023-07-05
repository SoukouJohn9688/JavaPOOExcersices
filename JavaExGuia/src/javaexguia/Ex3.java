/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
 *
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class Ex3 {
    
    public static void esVocal(){
        
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingresa una letra para verificar si es vocal o no, mi rey!");
    String letra=leer.nextLine();
    letra.toLowerCase();
    
    if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
        System.out.println("Es vocal mi eterno emperador!");
    }else{
        System.out.println("Nop, no es vocal su majestad sempiterno, es una consonante o un numero o un caracter, etc...");
    }
    
    }
}
