/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
 *
 * @Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
public class Ex22 {
    
    
    public static void rellenarConSuma(){
    Scanner leer=new Scanner(System.in);    
    int n=leer.nextInt();
    int m=leer.nextInt();
    int suma=0;
    
    int[][] matriz=new int[n][m];
        
        // Rellenar matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=(int)(Math.random()*20);
                suma+=matriz[i][j];
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    
        System.out.println("La suma de los elementos de la matriz es: "+ suma);
    
    }
    
}
