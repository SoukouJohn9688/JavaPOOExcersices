/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasojava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class RepasoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //InicializadorMatrices iniciar=new InicializadorMatrices();
        Scanner impresora=new Scanner(System.in);
        int fil;
        int col;
        Random rand=new Random();
        System.out.println("Ingrese la cantidad de filas seguido de la cantidad de columnasd");
        fil=Integer.parseInt(impresora.nextLine());
        col=Integer.parseInt(impresora.nextLine());
        int[][] matriz= new int[fil][col];
        int[][] matrizTrans= new int[col][fil];
        int[][] matriz1= new int[4][3];
        
//        for (int i = 0; i < matriz1.length; i++) {
//            for (int j = 0; j < matriz1[i].length; j++) {
//                System.out.print("[" + matriz1[i][j]+"]"+ " " );
//            }
//            System.out.println();
//        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int int_random = rand.nextInt(20); 
                matriz[i][j]=int_random;
                System.out.print("[" + matriz[i][j]+"]"+ " " );
            }
            System.out.println();
        }
        
        System.out.println();
         for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matrizTrans[j][i]= matriz[i][j];
               System.out.print("[" + matrizTrans[i][j]+"]"+" ");
            }
            System.out.println();
        }
        
    }
    
}
