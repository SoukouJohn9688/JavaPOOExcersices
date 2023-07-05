/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pelicula;
import java.util.Scanner;

/**
 *
 * @Escribir un programa en Java que simule un servicio de alquiler de
 * películas. El programa debe tener una clase Pelicula que represente los datos
 * de una película, como el título, el género, el año y la duración. El programa
 * también debe tener una clase Alquiler que represente los datos de un
 * alquiler, como la película alquilada, la fecha de inicio, la fecha de fin y
 * el precio. El programa puede usar la clase Date para manejar las fechas, la
 * clase Arrays para almacenar y ordenar las películas y los alquileres, la
 * clase Math para calcular el precio según la duración y el género de la
 * película, y la clase String para manipular los textos. El programa debe
 * permitir al usuario ingresar los datos de las películas disponibles y los
 * datos de los alquileres realizados, y mostrar por pantalla un menú con las
 * opciones de cargar una pelicula, hacer una lista de todas las peliculas
 * disponibles, crear un alquiler, realizar una lista de todos los alquileres,
 * buscar peliculas por titulo o por genero y buscar alquileres por fecha.
 */
public class PeliculasService {

    Scanner leer = new Scanner(System.in);
    Pelicula movie = new Pelicula();

    public Pelicula crearPelicula() {
        System.out.println("Porfavor ingrese los datos de la pelicula: ");
        System.out.println("Titulo: ");
        movie.setTitulo(leer.nextLine());
        System.out.println("Genero: ");
        movie.setGenero(leer.nextLine());
        System.out.println("Anio: ");
        movie.setAnio(leer.nextInt());
        leer.nextLine();
        System.out.println("Duracion: ");
        movie.setDuracion(leer.nextDouble());
        leer.nextLine();

        return movie;
    }

    public void listarPeliculas(Pelicula[] vectorPeliculas) {

        for (int i = 0; i < vectorPeliculas.length; i++) {
            System.out.println("Pelicula # " + i + vectorPeliculas[i].getTitulo());
        }
    }

    public Pelicula buscarPeliculasTitulo(Pelicula[] vectorPeliculas) {        
        String tituloElegido = "";
        System.out.println("Por favor ingrese el titulo de la pelicula: ");
        tituloElegido = leer.nextLine();
        for (int i = 0; i < vectorPeliculas.length; i++) {
            if (vectorPeliculas[i].getTitulo().equalsIgnoreCase(tituloElegido)) {
                System.out.println("La pelicula se encuentra en el catalogo-> " + vectorPeliculas[i].getTitulo());
                return vectorPeliculas[i];
            }
        }
            System.out.println("La pelicula no se encuentra en el catalogo. ");
            return null;  
           
    }

    public void buscarPeliculasGenero(Pelicula[] vectorPeliculas) {
        String generoSeleccionado = "";
        int cont = 0;
        System.out.println("Por favor ingrese el genero de la pelicula: ");
        generoSeleccionado = leer.nextLine();
        for (Pelicula vectorPelicula : vectorPeliculas) {
            if (vectorPelicula.getGenero().equalsIgnoreCase(generoSeleccionado)) {
                System.out.println(vectorPelicula.getTitulo());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No hay peliculas dentro de ese genero. ");
        }
        cont = 0;
}
}
