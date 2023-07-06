/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Pelicula;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class AlquilerService {

    Scanner leer = new Scanner(System.in);
    Alquiler alq = new Alquiler();
    PeliculasService servicio = new PeliculasService();

    public Alquiler crearAlquiler(Pelicula peliculas) {
        alq.setPelicula(peliculas);
        System.out.println("Ingrese los datos del alquiler:...");
        alq.setFechaInicio(LocalDate.now());
        System.out.println("Total de dias: ");
        int dias = leer.nextInt();
        alq.setFechaFin(alq.getFechaInicio().plusDays(dias));
        leer.nextLine();
        System.out.println("Precio: ");
        alq.setPrecio(calcularServicio(dias));
        return alq;
    }

    public void listarAlquileres(Alquiler[] alquileres) {
        System.out.println("Listar alquileres...");
        for (int i = 0; i < alquileres.length; i++) {
            System.out.println("Datos del alquiler"+alquileres[i].toString());
        }
    }

    public void buscarAlquiler(Alquiler[] alquileres, LocalDate fechaAlquiler ) {
        System.out.println("Buscando alquiler...");
        for (int i = 0; i < alquileres.length; i++) {
            if(alquileres[i].getFechaInicio().equals(fechaAlquiler)){
                System.out.println("Datos del alquiler"+alquileres[i].toString());
            }
        }
    }

    public double calcularServicio(int dias) {
        double precio = 10;
        if (dias > 3) {
            precio = precio * 1.1 * dias;
        }
        return precio;

    }

}
