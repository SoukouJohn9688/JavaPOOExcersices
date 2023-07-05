/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;
import javax.xml.stream.events.ProcessingInstruction;

/**
 *
 * @Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
public class Ex23 {
    
    
    
    //////// funcion de prueba
    public static void pruebaSopa(){
        Scanner leer=new Scanner(System.in);
        String[][] sopa=new String[5][5];
        String palabra="";
        int posicionletra=0;
        
        
        for (int i = 0; i < sopa.length-1; i++) {
            for (int j = 0; j < sopa.length-1; j++) {
                System.out.println("ingrese palabra");
                palabra=leer.nextLine();
                sopa[i][j]=palabra.substring(j,j+1);
                System.out.print("["+sopa[i][j]+"]");
                if(posicionletra<palabra.length()){
                     posicionletra++;
                }
               
            }
            System.out.println("");
        }
        
    }
    
    //////////////////////////
    
    
    
    public static void sopaDeLetras(){
        Scanner leer=new Scanner(System.in);
        String[][] sopa=new String[20][20];
       
        int fila=0;
        int position=0;
        int contPalabras=5;
        String palabra="";
        ///////////LLENAR MATRIZ
        for (int i = 0; i < sopa.length-1; i++) {
            for (int j = 0; j < sopa.length-1; j++) {
                sopa[i][j]=Integer.toString((int)(Math.random()*9));
                System.out.print("["+sopa[i][j]+"]");
            }
            System.out.println("");
        }
        //////////
        
        int colRand=0;
         
        do {
            colRand=(int)(Math.random()*15);
            fila=(int)(Math.random()*20);
            System.out.println("Ingrese una palabra de entre 3 y 5 caracteres para agreagar a la sopa: ");
            palabra=leer.nextLine();
            if(palabra.length()>=3 && palabra.length()<=5){
               
                    for (int j = 0; j < palabra.length(); j++) {
                        sopa[fila][j+colRand]=palabra.substring(j,j+1);
                    }
                    contPalabras--;
            }else{
                System.out.println("La palabra debe ser de minimo 3 o maximo 5 letras, vuelva a intentar, canalla!");
            }
            
        } while (contPalabras>0);
        
        ///////////////Sopa Completa
         for (int i = 0; i < sopa.length-1; i++) {
            for (int j = 0; j < sopa.length-1; j++) {
                System.out.print("["+sopa[i][j]+"]");
            }
            System.out.println("");
        }
        
        
    }
    
}
