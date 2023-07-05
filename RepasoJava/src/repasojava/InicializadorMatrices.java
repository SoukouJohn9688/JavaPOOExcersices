/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasojava;
import com.sun.source.tree.ForLoopTree;
import java.time.Clock;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jupac
 */
public class InicializadorMatrices {

    
    Scanner impresora=new Scanner(System.in);
    
    int fil;
    int col;
    Random rand=new Random();
    
    public InicializadorMatrices() {
        System.out.println("Ingrese la cantidad de filas seguido de la cantidad de columnasd");
        fil=Integer.parseInt(impresora.nextLine());
        col=Integer.parseInt(impresora.nextLine());
        int[][] matriz= new int[fil][col];
        int[][] matrizTrans= new int[col][fil];
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int int_random = rand.nextInt(20); 
                matriz[i][j]=int_random;
                System.out.println("[" + matriz[i][j]+"]"+ " " );
            }
            System.out.println();
        }
        
         for (int i = 0; i < matrizTrans.length; i++) {
            for (int j = 0; j < matrizTrans[i].length; j++) {
                matrizTrans[j][i]= matriz[i][j];
               System.out.println("[" + matrizTrans[i][j]+"]"+" ");
            }
            System.out.println();
        }
        
         for (int i = 0; i < fil-1; i++) {
            for (int j = 0; j < col-1; j++) {
               System.out.println("[" +matrizTrans[i][j]+"]"+" ");
            }
            System.out.println();
        }
         
                
    }

    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int getFil() {
        return fil;
    }

    public void setFil(int fil) {
        this.fil = fil;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
 
    
    
      
    
}
