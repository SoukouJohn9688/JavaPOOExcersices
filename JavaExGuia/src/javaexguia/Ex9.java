/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
 *
 * @Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
public class Ex9 {
    
    
    public static void dividirPorResta(){
    Scanner leer=new Scanner(System.in);
   
    
    int Dividendo;
    int Divisor;
    int residuo;
    int cociente=1;
        do {        
             System.out.println("Ingrese el dividendo seguido del divisor: ");
             Dividendo=leer.nextInt();
             Divisor=leer.nextInt();
             while(Dividendo>Divisor){
                 Dividendo=Dividendo-Divisor;
                 cociente++;
             }
             residuo=Dividendo;
             System.out.println("El residuo es: "+residuo+", el cociente es: "+cociente);
        } while (Dividendo>1 || Divisor>1);
    
        
    }
    
}
