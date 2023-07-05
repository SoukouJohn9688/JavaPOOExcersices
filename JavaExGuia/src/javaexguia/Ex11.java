/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
 *
 * @Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
public class Ex11 {
    
    public static int devolverCantidadDigitos(){
        
        Scanner leer=new Scanner(System.in);
        int digitos=0;
        System.out.println("Ingrese porfa el numero deseado: ");
        int numero=leer.nextInt();
        int extractor=numero;
        
        while(extractor>0){
            extractor=extractor/10;
            digitos++;
        }
        return digitos;
    }
}
