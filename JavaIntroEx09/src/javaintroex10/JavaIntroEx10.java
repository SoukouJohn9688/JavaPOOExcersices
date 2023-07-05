/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroex10;

import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class JavaIntroEx10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        Scanner leer=new Scanner(System.in);
        
        for(int i=0;i<4;i++){
            
            num1=leer.nextInt();
            if(num1>=1 && num1<=20){
                System.out.print(num1+" ");
                for(int j=0;j<num1;j++){
                    System.out.print("*");
                }
                System.out.println("");
                   
            }
            
        }
        
        
    }
    
}
