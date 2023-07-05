/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo
 */
public class ServicioMovil {
    
    Movil celular=new Movil();
    Scanner leer=new Scanner(System.in);
    
    public Movil cargarCelular(){
        
        
        System.out.println("Ingrese los datos del celular: ");
        System.out.println("Marca: ");
        celular.setMarca(leer.nextLine());
        System.out.println("Precio: ");
        celular.setPrecio(leer.nextDouble());
        leer.nextLine();
        System.out.println("Modelo: ");
        celular.setModelo(leer.nextLine());
        System.out.println("Ram: ");
        celular.setMemoriaRam(leer.nextInt());
        leer.nextLine();
        System.out.println("Almacenamiento: ");
        celular.setAlmacenamiento(leer.nextInt());
        leer.nextLine();
        return celular;
    }
    
    
    public String[] ingresarCodigo(){
        
        String[] vectorLlenado=new String[7];
        System.out.println("Ingrese cada caracter o numero del codigo");
        for (int i = 0; i < celular.getCodigo().length; i++) {
            vectorLlenado[i]=leer.nextLine();
        }
        celular.setCodigo(vectorLlenado);
       return celular.getCodigo();
    }
    
    
}
