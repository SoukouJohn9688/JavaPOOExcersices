/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Pelicula;
import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class AlquilerService {
    
    Scanner leer = new Scanner(System.in);
    Alquiler alq=new Alquiler();
    PeliculasService servicio=new PeliculasService();
    
    public Alquiler crearAlquiler(Pelicula[] peliculas){
        
        System.out.println("Ingrese los datos del alquiler:...");
        alq.setPelicula(servicio.buscarPeliculasTitulo(peliculas));
        if(alq.getPelicula().equals(null)){
        return null;
        }else{ System.out.println("Fecha Inicio: ");
        System.out.println("Fecha Fin: ");
        System.out.println("Pelicula: ");
        return alq;
        }
       
    }
    public void listarAlquiler(){}
    public void buscarAlquiler(){}
    public void calcularServicio(){}
    
}
