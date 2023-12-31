/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooex11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class Pooex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese dia, mes y anio, en ese orden porfa, porfa...porfa");
        int dia=leer.nextInt();
        int mes=leer.nextInt();
        int anio=leer.nextInt();
        
        Date fecha=new Date(anio-1900,mes-1,dia);
        Date fechaActual=new Date();
        
        int diferenciaAnios=fechaActual.getYear()-fecha.getYear();
        System.out.println("Primera fecha: "+fecha.toString());
        System.out.println("Fecha actual: "+fechaActual.toString());
        System.out.println("La diferencia en anios es: "+Math.abs(diferenciaAnios));
    }
    
}
