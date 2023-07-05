/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooexej01;

import Servicio.ServicioVehiculo;

/**
 *
 * @Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos a indicar si es un
automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
Referencias:
-
Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
avanzó.
 */
public class PooExEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioVehiculo v1=new ServicioVehiculo();
        ServicioVehiculo v2=new ServicioVehiculo();
        ServicioVehiculo v3=new ServicioVehiculo();
        
        System.out.println("Preparados,listos, ya!!!!!!");
        v1.Moverse(5);
        v2.Moverse(5);
        v3.Moverse(5);
        
        System.out.println("Resultados primera carrera: ");
        System.out.println("El recorrido total para el vehiculo 1 es: "+v1.getKilometraje());
        System.out.println("El recorrido total para el vehiculo 2 es: "+v2.getKilometraje());
        System.out.println("El recorrido total para el vehiculo 3 es: "+v3.getKilometraje());
        ///////////// Segunda carrera
        v1.reiniciarKilometraje();
        v2.reiniciarKilometraje();
        v3.reiniciarKilometraje();
        ////////////////
        System.out.println("Lap 2!!!!!!");
        v1.Moverse(10);
        v2.Moverse(10);
        v3.Moverse(10);
        
        System.out.println("Resultados segunda carrera: ");
        System.out.println("El recorrido total para el vehiculo 1 es: "+v1.getKilometraje());
        System.out.println("El recorrido total para el vehiculo 2 es: "+v2.getKilometraje());
        System.out.println("El recorrido total para el vehiculo 3 es: "+v3.getKilometraje());
        ///////////// Tercera carrera
        v1.reiniciarKilometraje();
        v2.reiniciarKilometraje();
        v3.reiniciarKilometraje();
        ////////////////
        
        
        System.out.println("Lap 3!!!!!!");
        v1.Moverse(60);
        v2.Moverse(60);
        v3.Moverse(60);
        
        System.out.println("Resultados tercera carrera: ");
        System.out.println("El recorrido total para el vehiculo 1 es: "+v1.getKilometraje());
        System.out.println("El recorrido total para el vehiculo 2 es: "+v2.getKilometraje());
        System.out.println("El recorrido total para el vehiculo 3 es: "+v3.getKilometraje());
        
        /////////////////Prueba de recorrido maximo despues de frenar.
         ///////////// Inicializacion de ultimo recorrido
        v1.reiniciarKilometraje();
        v2.reiniciarKilometraje();
        v3.reiniciarKilometraje();
        ////////////////
        System.out.println("Hasta la ultima gota de combustible!!!!!!");
        v1.Moverse(300);
        v2.Moverse(300);
        v3.Moverse(300);
        
        v1.Frenar();
        v2.Frenar();
        v3.Frenar();
        
       if(v1.getKilometraje()>v2.getKilometraje() && v1.getKilometraje()>v3.getKilometraje()){
           System.out.println("Distancia maxima recorrida por vehiculo 1: "+v1.getKilometraje());
       }else if(v2.getKilometraje()>v1.getKilometraje() && v2.getKilometraje()>v3.getKilometraje()){
           System.out.println("Distancia maxima recorrida por vehiculo 2: "+v2.getKilometraje());
       }else{
           System.out.println("Distancia maxima recorrida por vehiculo 3: "+v3.getKilometraje());
       }
       
       
       
    }
    
}
