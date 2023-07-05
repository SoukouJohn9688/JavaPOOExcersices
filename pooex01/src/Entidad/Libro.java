/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author jupac
 */
public class Libro {
    
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroPaginas;

    public Libro(int ISBN, String Titulo, String Autor, int NumeroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    }

    public Libro() {
    }
    
    public void cargarLibro(){
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese los datos en el orden:");
        System.out.println("ISBN,Titulo,Autor,# Paginas...");
        ISBN=leer.nextInt();
        leer.nextLine();
        Titulo=leer.nextLine();
        Autor=leer.nextLine();
        NumeroPaginas=leer.nextInt();
        desplegarDatos(ISBN, Titulo, Autor, NumeroPaginas);
    
    }
    
    public static void desplegarDatos(int isbn, String titulo, String autor,int numeroPag){
        System.out.println("Los datos del libro son: ");
        System.out.println("ISBN: "+isbn);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Numero de Paginas: "+numeroPag);
    }
    
}
