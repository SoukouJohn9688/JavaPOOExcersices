/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.awt.BorderLayout;

/**
 *
 * @author jupac
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
    }
    
    public void servirTaza(int tamanoTaza){
        System.out.println("Sirviendo cafecito...");
        if(cantidadActual<tamanoTaza){
            System.out.println("Yuca, no alcanzo el cafe: ");
            System.out.println("Te quedo llena unos: "+cantidadActual+"mmls");
        }else{
            System.out.println("La taza quedo llena con "+tamanoTaza+" de cafe");
        }
    }
    public  void vaciarCafetera(){
        cantidadActual=0;
    }
    public  void agregarCafe(int cantidad){
        cantidadActual+=cantidad;
    }
    
    
    
    
    
    
    
}
