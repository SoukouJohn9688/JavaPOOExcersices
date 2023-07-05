/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cadena;

/**
 *
 * @author jupac
 */
public class ServiciosCadena {
    Cadena cad=new Cadena();
    private String frase=cad.getFrase();
    
    
    /**
     * Implementacion de metodos de clase
     */
    public void mostrarVocales(){
        System.out.println("Contando vocales");
        int cont=0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='a' || frase.charAt(i)=='e'|| frase.charAt(i)=='i'
               || frase.charAt(i)=='o' || frase.charAt(i)=='u'){
                System.out.println("Aparece vocal: "+frase.charAt(i));
                cont++;
            }
        }
        System.out.println("El total de vocales es: "+cont);
    }
    
    public String invertirFrase(){
        String inv="";
        for (int i = frase.length()-1; i>=0; i--) {
            inv+=frase.charAt(i);
        }
        return inv;
    }
    
    public void vecesRepetido(char letra){
        
        int cont=0;
        for (int i = 0; i < frase.length(); i++) {
            if(letra==frase.charAt(i)){
                cont++;
            }
        }
        System.out.println("La letra: "+letra+", se repite "+cont+" veces");
    }
    
    public void compararLongitud(String frase){
        System.out.println("Comparando longitud de la primera frase con la segunda ingresada...");
        if(this.frase.length()==frase.length()){
            System.out.println("La frases tienen la misma longitud. "+frase.length());
        }else{
            System.out.println("Las frase tiene una longitud distinta: "+this.frase.length()+" y "+frase.length()+"respectivamente.");
        }
    }
    
    public void unirFrases(String frase){
        System.out.println(this.frase+frase);
    }
    
    public void reemplazar(String letra){
        for (int i = 0; i < this.frase.length(); i++) {
            if(this.frase.charAt(i)=='a'){
              this.frase=frase.replace('a', letra.charAt(0));
            }
        }
        System.out.println("Frase modificada: "+frase);
    }
    
    public boolean contiene(String letra){
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)==letra.charAt(0)){
                return true;
            }
        }
        return false;
    }
}
