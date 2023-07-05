/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class ServicioPersona {
    Persona personilla=new Persona();
    
    
    public Persona crearPersona(){
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        personilla.setNombre(leer.nextLine());
        System.out.println("Ingrese Anio,mes y dia de la fecha de nacimiento: ");
        int anio=leer.nextInt();
        leer.nextLine();
        int mes=leer.nextInt();
        leer.nextLine();
        int dia=leer.nextInt();
        Date fechaNac=new Date(anio-1900,mes-1,dia);
        personilla.setFechaNacimiento(fechaNac);
        return personilla;
        
    }
    
    public int calcularEdad(Date fechaNac){
            
        Date fechaActual=new Date();
        int diff=fechaActual.getYear()-fechaNac.getYear();
        return diff;
    }
    
    public boolean menorQue(int otraEdad){
        int edadPersona=calcularEdad(personilla.getFechaNacimiento());
        if(edadPersona<=otraEdad){
        return true;
        }
        return false;
    }
    
    public void mostrarPersona(){
        System.out.println("Los datos de la persona son: ");
        System.out.println("Nombre: "+personilla.getNombre());
        System.out.println("Fecha de nacimiento: "+personilla.getFechaNacimiento());
        System.out.println("Edad: "+calcularEdad(personilla.getFechaNacimiento()));
    }
}
