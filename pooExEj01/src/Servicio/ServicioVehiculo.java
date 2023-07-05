/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class ServicioVehiculo {
    Vehiculo veh=new Vehiculo();

    public ServicioVehiculo() {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa por favor los datos del vehiculo: ");
        System.out.println("Modelo, marca, anio, kilometraje,tipo. En ese orden porfa");
        veh.setModelo(leer.nextLine());
        veh.setMarca(leer.nextLine());
        veh.setAnio(leer.nextInt());
        leer.nextLine();
        veh.setKilometraje(leer.nextInt());
        leer.nextLine();
        ///////Ingreso de tipo
        System.out.println("Las opciones del tipo son: ");
        System.out.println("1: Automobil");
        System.out.println("2: Motocicleta");
        System.out.println("3: Bicicleta");
        
        veh.setTipo(leer.nextInt());
        leer.nextLine();
        while(veh.getTipo()<1 || veh.getTipo()>3){
            System.out.println("El tipo ingresado es incorrecto, por favor utilice solo 1,2, o 3.");
            veh.setTipo(leer.nextInt());
            leer.nextLine();
        }
        
        
        
        switch (veh.getTipo()) {
            case 1:
                  System.out.println("Automobil");
                  veh.setVelocidad(3);
                break;
            case 2:
                System.out.println("Motocicleta");
                  veh.setVelocidad(2);
                break;
            case 3:
                System.out.println("Bicicleta");
                  veh.setVelocidad(1);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
    
    public void Moverse(int tiempo){
        System.out.println("Iniciando recorrido...");
        veh.setKilometraje(veh.getKilometraje()+(veh.getVelocidad()*tiempo));
        System.out.println("El vehiculo recorrio: "+veh.getVelocidad()*tiempo);
        
    }
    
    public void Frenar(){
        System.out.println("Frenando el vehiculo...");
        if(veh.getTipo()!=3){
            veh.setKilometraje(veh.getKilometraje()+2);
        }
        System.out.println("El vehiculo ha frenado.");
    }
    
    public void reiniciarKilometraje(){
        veh.setKilometraje(0);
    }
    
    public int getKilometraje(){
        return veh.getKilometraje();
    }
        
        
}
