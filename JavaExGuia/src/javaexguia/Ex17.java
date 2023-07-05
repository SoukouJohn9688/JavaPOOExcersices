/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
 *
 * @Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
¿Qué son los números primos?
Básicamente, un número primo es un número natural que tiene solo dos divisores o
factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir por
uno y por el mismo número.
El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 2, 3, 5, 7, 11,
13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
 */
public class Ex17 {
    
    public static boolean esPrimo(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el numero a corroborar");
        int numero=leer.nextInt();
   
        return operacion(numero);
    }
    
    private static boolean operacion(int numero){
        boolean esPrimo=true;
        for(int i=2;i<numero;i++){  
            if(numero%i!=0){
                System.out.println("Comprobando...");      
            }else{
                esPrimo=false;
                return esPrimo;
            }
        }
        return esPrimo;
    }
}
