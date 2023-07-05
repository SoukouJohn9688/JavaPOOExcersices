/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Ex1 {
    
    
    
    
    public static void calcularDesdeMinutos(int min){
        Scanner leer=new Scanner(System.in);
        int minutos=min;
        System.out.println("Ingres porfis la cantidad de minutos a convertir: ");
    //int minutos=leer.nextInt();
    int horas=minutos/60;
    float dias=horas/24;
    
        System.out.println("En base a: "+minutos+" el equivalente en : ");
        System.out.println("Horas: "+horas);
        System.out.println(" Dias: "+dias);
    }
    
    
    
    
    
}
