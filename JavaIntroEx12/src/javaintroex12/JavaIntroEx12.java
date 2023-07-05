/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroex12;

import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class JavaIntroEx12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        
        
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        encontrarSiMultiplo(num1, num2);
        
        
        
        
    }
 public static void encontrarSiMultiplo(int num1,int num2)
        {
          
            if((num1%num2)==0){
                System.out.println("El numero: "+num1+" es multiplo de: "+num2);
            }else
                System.out.println("Nada pa, el primero no es multiplo del segundo");
        }   
}
