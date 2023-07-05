/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Matematica;
import java.time.chrono.ThaiBuddhistEra;


/**
 *
 * @author jupac
 */
public class ServicioMatematica {
    
    
     private static double menor;

    public static double getMenor() {
        return menor;
    }

    public static void setMenor(double menor) {
        ServicioMatematica.menor = menor;
    }
    
    
    
    public static double devolverMayor(Matematica operacion){
        
        if(operacion.getNum1()>operacion.getNum2()){
            System.out.println("El primer numero es mayor"+operacion.getNum1());
            setMenor(operacion.getNum2());
            calcularRaiz(getMenor());
            return operacion.getNum1();
        }else if(operacion.getNum1()<operacion.getNum2()){
            System.out.println("El segundo numero es mayor"+operacion.getNum2());
            setMenor(operacion.getNum2());
            calcularRaiz(getMenor());
            return operacion.getNum2();
        }else{
            System.out.println("meh, son iguales");
            return 1;
        }
        
    }
    
    public static double calcularPotencia(double mayor){
        return Math.pow(mayor, 2);
    }
    
    public static void calcularRaiz(double menor){
        System.out.println("La raiz cuadrada del menor valor es: "+Math.sqrt(menor));
    }
    
   
    
}
