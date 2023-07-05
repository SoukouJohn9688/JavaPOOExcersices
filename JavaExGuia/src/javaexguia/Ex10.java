/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
 *
 * @Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
public class Ex10 {
    
    public static void adiviniarMultiplicacion(){
    
        Scanner leer=new Scanner(System.in);
        int eleccion;
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        int producto=num1*num2;
        
        do {
            
        System.out.println("Ingrese porfa su numero a ver si le atina!, escriba the number of the beast, para salir!");
            System.out.println("Los numeros a multiplicar estaran entre 0 y 10 para que sepa!");
        eleccion=leer.nextInt();
        
        if(eleccion==producto){
            System.out.println("Por los muertos de Messi! Ese es!: "+producto);
        }else{
            System.out.println("Nop, try again brotha!");
        }
            System.out.println("Aqui te soplo la respueta!: "+producto);
        
        } while (eleccion!=666);
        
        
    
    }
            
}
