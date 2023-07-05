/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class servicioscuenta {
   public static Cuenta acc=new Cuenta();
   
   
   
   
   
    public static Cuenta crearCuenta(){
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese datos de la cuenta: ");
        System.out.println("Numero,DNI, Interes");
        acc.setSaldo(2000000);
        
        acc.setNumeroCuenta(leer.nextInt());
        leer.nextLine();
        acc.setDNI(leer.nextLong());
        leer.nextLine();
        acc.setInteres(20000);
        
        return acc;
        
                
    }
    
    public static void ingresar(double ingreso){
        acc.saldo+=ingreso;
    }
    
    public static void retirar(double retiro){
        if(acc.saldo<retiro){
            acc.saldo=0;
        }else{
            acc.saldo-=retiro;
        }
    }
    
    public static double extraccionRapido(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese cuanto dinero desea retirar: ");
        double extraccion=leer.nextInt();
        if(extraccion<=acc.saldo*0.20){
            return extraccion;
        }else{
            System.out.println("No debe sacar mas que el 20% de sus ahorros!");
            return 0;
        }
    
    }
    
    public static void consultarSaldo(){
        System.out.println("Su saldo actual es: "+acc.saldo);
    }
    public static void consultarDatos(){
        System.out.println("Saldo: "+acc.saldo);
        System.out.println("Numero de cuenta: "+acc.numeroCuenta);
        System.out.println("interes: "+acc.interes);
        System.out.println("DNI: "+acc.DNI);
    }
       
        
    
    
    
    
}
