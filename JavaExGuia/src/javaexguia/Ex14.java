/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
 *
 * @Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
public class Ex14 {
    public static void main(String[] args) {
        promedioEdadNinos();
    }
    
    public static void promedioEdadNinos(){
        Scanner leer=new Scanner(System.in);
        int n=0;
        int m=0;
        int promedio=0;
        int cont=1;
        int ninosTotales=0;
        System.out.println("Ingrese el numero de familias");
        n=leer.nextInt();
        leer.nextLine();
           
            for (int i = 0; i <n; i++) {
            System.out.println("Ingrese el numero de ninos dentro de la familia");
            m=leer.nextInt();
            leer.nextLine();
            ninosTotales+=m;
            while(cont<=m){
                System.out.println("Ingresa la edad del nino: "+cont);
               
                promedio+=leer.nextInt();
                //leer.nextLine();
                cont++;
            }
            }
        promedio/=ninosTotales;
        System.out.println("El promedio de edad total de todos los ninos es: "+promedio);
        }
    }

