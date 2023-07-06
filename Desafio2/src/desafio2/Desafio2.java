/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio2;

import Entidad.Alquiler;
import Entidad.Pelicula;
import Servicio.AlquilerService;
import Servicio.PeliculasService;
import java.time.LocalDate;
import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class Desafio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculasService servMovie = new PeliculasService();
        AlquilerService servAlq = new AlquilerService();
        Scanner leer = new Scanner(System.in);
        ArrayList<Alquiler> alquileres = new ArrayList<>();
        ArrayList<Pelicula> peliculas = new ArrayList<>(); //Crear arreglo de peliculas dinamico.
        //peliculas.add(servMovie.crearPelicula());
        Pelicula[] arregloMovies;
        Alquiler[] arregloAlquileres;
        //peliculas.toArray(arregloMovies);

        /////////MENU////////////// 
        
        int eleccion=0;
        Pelicula movieElegida;
        while (eleccion!=8) {
            imprimirMenu();
            eleccion=leer.nextInt();
            leer.nextLine();
            switch (eleccion) {
                case 1:
                    peliculas.add(servMovie.crearPelicula());
                    break;
                case 2:
                     arregloMovies = new Pelicula[peliculas.size()];
                     peliculas.toArray(arregloMovies);
                     servMovie.listarPeliculas(arregloMovies);
                    break;
                case 3:
                    arregloMovies = new Pelicula[peliculas.size()];
                    peliculas.toArray(arregloMovies);
                    movieElegida=servMovie.buscarPeliculasTitulo(arregloMovies);
                    if(movieElegida!=null){
                      alquileres.add(servAlq.crearAlquiler(movieElegida));
                    }else{
                        System.out.println("Mi viejo/a, esa pelicula no existe.");
                    }
                    break;
                case 4:
                    arregloAlquileres=new Alquiler[alquileres.size()];
                    alquileres.toArray(arregloAlquileres);
                    servAlq.listarAlquileres(arregloAlquileres);
                    break;
                case 5:
                    arregloMovies = new Pelicula[peliculas.size()];
                    peliculas.toArray(arregloMovies);
                    servMovie.buscarPeliculasTitulo(arregloMovies);
                    break;
                case 6:
                    arregloMovies = new Pelicula[peliculas.size()];
                    peliculas.toArray(arregloMovies);
                    servMovie.buscarPeliculasGenero(arregloMovies);
                    break;
                case 7:
                    arregloAlquileres=new Alquiler[alquileres.size()];
                    alquileres.toArray(arregloAlquileres);
                    System.out.println("Por favor ingrese la fecha del alquiler: ");
                    System.out.println("aaaa-mm-dd");
                    servAlq.buscarAlquiler(arregloAlquileres, LocalDate.parse(leer.nextLine()));
                    break;
                case 8:
                    System.out.println("Se quiere ir? s/n ");
                    String eleccionSalida=leer.nextLine();
                    if(eleccionSalida.equalsIgnoreCase("s")){
                        System.out.println("Chauuuuu!");
                    }else{
                        eleccion=0;
                    }
                    break;
                default:
                     System.out.println("???? Elija una opcion valida porfa, sea serio.");
            }
            
        }

    }
    
    public static void imprimirMenu(){
    
        System.out.println("Elija entre las opciones: ");
        System.out.println("1-Crear pelicula. ");
        System.out.println("2-Listar peliculas. ");
        System.out.println("3-Crear alquiler ");
        System.out.println("4-Lista de alquileres. ");
        System.out.println("5-Buscar por titulo. ");
        System.out.println("6-Buscar por genero. ");
        System.out.println("7-Buscar alquiler por fecha. ");
        System.out.println("8-Salir");
    }

}
