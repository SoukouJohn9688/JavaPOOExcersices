/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jupac
 */
public class Ahorcado {
    
    //private String[] vectorPalabras={"moonspell","carcass","deutchbag","perro","marmota"};
    private String[] vectorPalabras;
    private int letrasEncontradas;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(int letrasEncontradas, int jugadasMax) {
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }

    public String[] getVectorPalabras() {
        return vectorPalabras;
    }

    public void setVectorPalabras(String[] vectorPalabras) {
        this.vectorPalabras = vectorPalabras;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    
}
