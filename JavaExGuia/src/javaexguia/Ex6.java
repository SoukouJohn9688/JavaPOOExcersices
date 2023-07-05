/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

import java.util.Scanner;

/**
 *
 * @Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Ex6 {
    public static void main(String[] args) {
        estaturaPromedio();
    }
    
    public static void estaturaPromedio(){
        Scanner leer=new Scanner(System.in);
        float promedioMenor=0;
        float promedioGeneral=0;
        int n;
        float cont=1;
        float contPersonBaja=0;
        float contPersonNormal=0;
        float estatura;
        System.out.println("Ingrese el numero de personas a evaluar: ");
        n=leer.nextInt();
        
        do {            
            System.out.println("Ingrese la estatura de la persona: "+(cont+1));
            estatura=leer.nextFloat();
            
            if(estatura<1.60){
                promedioMenor+=estatura;
                contPersonBaja++;
            }else{
                promedioGeneral+=estatura;
                contPersonNormal++;
            }
            
            cont++;
        } while (cont<=n);
        leer.close();
        promedioMenor=promedioMenor/contPersonBaja;
        promedioGeneral=promedioGeneral/contPersonNormal;
        
        System.out.println("Total personas bajas: "+contPersonBaja);
        System.out.println("Total personas de la media: "+contPersonNormal);
        System.out.println("El promedio de personas mas bajas de 1.60m es: "+promedioMenor);
        System.out.println("El promedio de personas general es: "+promedioGeneral);
    }
}
