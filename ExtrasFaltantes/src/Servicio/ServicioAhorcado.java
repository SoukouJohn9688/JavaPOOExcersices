/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @
 
 
 
 
 
 */
public class ServicioAhorcado {
    ////Atributo de clase
    Ahorcado hangedMan=new Ahorcado();
    Scanner leer=new Scanner(System.in);
    
    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.*/
    public void crearJuego(){
        System.out.println("Ingrese palabra y cantidad de jugadas maximas...");
        System.out.println("Palabra...");
        String palabra=leer.nextLine();
        String[] vector=new String[palabra.length()];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=palabra.substring(i,i+1);
            System.out.print("["+vector[i]+"]");
        }
        
        hangedMan.setVectorPalabras(vector);
        
        System.out.println("Jugadas Maximas...");
        hangedMan.setJugadasMax(leer.nextInt());
        leer.nextLine();
        hangedMan.setLetrasEncontradas(0);
        
    
    }
    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
    */
    public void longitud(){
        System.out.println("Longitud de la palabra secreta: "+hangedMan.getVectorPalabras().length);
    
    }
    /*
    Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    */
    public void buscar(String letra){
        for (int i = 0; i < hangedMan.getVectorPalabras().length; i++) {
            if(letra==hangedMan.getVectorPalabras()[i]){
                System.out.println("La letra se encuentra en la palabra");
                //hangedMan.setLetrasEncontradas(hangedMan.getLetrasEncontradas()+1);
            }else{
                System.out.println("La letra no se encuentra en la palabra");
                //hangedMan.setJugadasMax(hangedMan.getJugadasMax()-1);
            }
        }
        
    }
    /*
    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
    */
    public boolean encontradas(String letra){
        System.out.println("Usted ha encontrado: "+hangedMan.getLetrasEncontradas()+" letras!");
        System.out.println("Le faltan: "+(hangedMan.getVectorPalabras().length-hangedMan.getLetrasEncontradas())+" letras!");
       for (int i = 0; i < hangedMan.getVectorPalabras().length; i++) {
            if(letra==hangedMan.getVectorPalabras()[i]){
                System.out.println("La letra se encuentra en la palabra");
                hangedMan.setLetrasEncontradas(hangedMan.getLetrasEncontradas()+1);
                return true;
            }
        }
       System.out.println("La letra no se encuentra en la palabra");
       hangedMan.setJugadasMax(hangedMan.getJugadasMax()-1);
       return false;
    
    }
    /*
    Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    */
    public void intentos(){
        System.out.println("Le quedan: "+hangedMan.getJugadasMax()+" intentos.");
    }
    /*
    Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main. 
    */
    public void juego(){
        crearJuego();
        longitud();
        System.out.println("Ingrese una letra...");
        String letra=leer.nextLine();
           
        while (letra.length()>1) {            
            System.out.println("Recuerde que debe ser una sola letra, intente de nuevo!");
            letra=leer.nextLine();
        }
        buscar(letra);
        
        while(hangedMan.getJugadasMax()>0 ||
                hangedMan.getLetrasEncontradas()==hangedMan.getVectorPalabras().length)
        {
            encontradas(letra);
        
        }
        
        System.out.println("Genial!! eres un/a fucking genio!!!! La palabra es: "+hangedMan.getVectorPalabras());
    }
}
