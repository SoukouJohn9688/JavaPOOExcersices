/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
 *
 * @Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
public class Ex13 {
    public static void main(String[] args) {
        escaleraNumerica();
    }
    
    public static void escaleraNumerica(){
        Scanner leer=new Scanner(System.in);
        int altura=leer.nextInt();
        
        for (int i = 0; i <=altura; i++) {
            for (int j = 1; j <=i; j++) {
            int ant=j-1;
            
            System.out.print(j);
            //
            
            
        }
            System.out.println();
        }
        
    }
}
