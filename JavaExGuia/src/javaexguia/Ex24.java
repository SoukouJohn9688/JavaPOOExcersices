/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
 *
 * @Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.

 */
public class Ex24 {
    
    
    public static void calculcarVectorFibonacci(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el orden fibonacci N: ");
         int n=0;
         int n_1=1;
         int n_2=1;
         int actual=0;
         
        
        /////// Validacion orden N
        do {            
            n=leer.nextInt();
            if(n>1){
                
                System.out.println("Excelente! Sigamos"); 
                break;
            }else{
            System.out.println("Ingrese un numero mayor a 1, no sea canalla!");
            }
            
        } while (n>=1);
        //////////////////////////////
        
        // INICIALIZACION DE VECTOR:
        int[] vectorFibo=new int[n];
        //////////////////
       
        System.out.println("!n");
        for (int i = 0; i < n; i++) {
            actual=n_1+n_2;
            vectorFibo[i]=actual;
            System.out.print("["+vectorFibo[i]+"]");
            n_2=n_1;
            n_1=actual;
            
            
           
           
            
            
            
        }
        
        
        
       
        
    }
}
