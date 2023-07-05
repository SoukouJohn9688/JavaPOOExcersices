/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroex01;
import java.util.Scanner;
/**
 *
 * @author jupac
 */
public class JavaIntroEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
         int num1=0;
         int suma=0;
         Scanner leer=new Scanner(System.in);
         String numeroIngresado;
        // JavaIntroEx02 calculo=new JavaIntroEx02();
        // calculo.DeterminarTipoMotor(num1);
         
        
         int cont=0;
         do { 
    
             System.out.println("Ingresa el numero a sumar distinto de 0: ");
             num1=leer.nextInt();
             
         
         if(!(num1==0)){
             if(!(num1<0)){
             suma=suma+num1;
             
         }
                
         }else{
              System.out.println("Se ha capturado el innombrable 0! Chauuuuu");
                 break;
         }
             cont++;
        } while (cont<20);
         
         System.out.println("El total de la suma es: "+ suma);
        
      
      
    }
    
}
