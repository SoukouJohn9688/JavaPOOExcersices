/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaintroex01;
import java.util.Scanner;
/**
 *
 * @author jupac
 */
public class JavaIntroEx02 {

    public JavaIntroEx02() {
    }
    
    int tipoMotor;
    
    public void DeterminarTipoMotor(int tipo){
        this.tipoMotor=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el numero para determinar el tipo de motor del 1 al 4: ");
        tipoMotor=leer.nextInt();
        
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                 System.out.println("La bomba es una bomba de gasolina");
                 break;
            case 3:
                 System.out.println("La bomba es una bomba de hormigon");
                 break;

            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("El numero ingresado no corresponde a un tipo de bomba en concreto, vuelta a intentarlo");

        }
    }
    
}
