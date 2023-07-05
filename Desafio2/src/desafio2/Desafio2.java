/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio2;

import Entidad.Pelicula;
import Servicio.AlquilerService;
import Servicio.PeliculasService;
import java.util.ArrayList; // import the ArrayList class


/**
 *
 * @author jupac
 */
public class Desafio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculasService servMovie=new PeliculasService();
        AlquilerService servAlq=new AlquilerService();
        
        
        ArrayList<Pelicula> peliculas = new ArrayList<>(); //Crear arreglo de peliculas dinamico.
        peliculas.add(servMovie.crearPelicula());
        
       /////////MENU////////////// 
        System.out.println("Como desea buscar su pelicula:"); 
        System.out.println("Por titulo o por genero?,Titulo: 1, Genero: 2");     
        
        
    }
    
}
