/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.uis.pooex07;

import servicios.personaServicios;
import Entidad.Persona;

/**
 *
 * @Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
* cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
public class Pooex07 {

    public static void main(String[] args) {
        
        personaServicios ps=new personaServicios();
        System.out.println("Ingrese datos de persona 1");
        Persona p1=ps.crearPersona();
        System.out.println("Ingrese datos de persona 2");
        Persona p2=ps.crearPersona();
        System.out.println("Ingrese datos de persona 3");
        Persona p3=ps.crearPersona();
        System.out.println("Ingrese datos de persona 4");
        Persona p4=ps.crearPersona();
        
        int numDebajo=4;
        int numIdeal=4;
        int numEncima=4;
        
        int esMayor=0;
        int esMenor=0;
        double porcentajeMayor=0;
        double porcentajeMenor=0;
        double porcentajeDebajo=0;
        double porcentajeIdeal=0;
        double porcentajeEncima=0;
        
        int imc1=ps.calcularIMC(p1.getPeso(),p1.getAltura());
        if(imc1==-1){
            numDebajo--;
        }else if(imc1==1){
            numEncima--;
        }else{
            numIdeal--;
        }
        ///////
        int imc2=ps.calcularIMC(p2.getPeso(),p2.getAltura());
        if(imc2==-1){
            numDebajo--;
        }else if(imc2==1){
            numEncima--;
        }else{
            numIdeal--;
        }
        ///////
        int imc3=ps.calcularIMC(p3.getPeso(),p3.getAltura());
        if(imc3==-1){
            numDebajo--;
        }else if(imc3==1){
            numEncima--;
        }else{
            numIdeal--;
        }
        ///////
        int imc4=ps.calcularIMC(p4.getPeso(),p4.getAltura());
        if(imc4==-1){
            numDebajo--;
        }else if(imc4==1){
            numEncima--;
        }else{
            numIdeal--;
        }
        
        porcentajeDebajo=(numDebajo*100)/4;
        porcentajeEncima=(numEncima*100)/4;
        porcentajeIdeal=(numIdeal*100)/4;
        
        
        
        ////conteo mayoria de edad
        boolean mayor1=ps.esMayorDeEdad(p1.getEdad());
        if(mayor1){
            esMayor++;
        }else{
            esMenor++;
        }
        boolean mayor2=ps.esMayorDeEdad(p2.getEdad());
        if(mayor2){
            esMayor++;
        }else{
            esMenor++;
        }
        boolean mayor3=ps.esMayorDeEdad(p3.getEdad());
        if(mayor3){
            esMayor++;
        }else{
            esMenor++;
        }
        boolean mayor4=ps.esMayorDeEdad(p4.getEdad());
        if(mayor4){
            esMayor++;
        }else{
            esMenor++;
        }
        
        porcentajeMayor=(esMayor*100)/4;
        porcentajeMenor=(esMenor*100)/4;
        
        System.out.println("Porcertanje de peso ideal: "+porcentajeIdeal+" ,porcentaje debajo: "+porcentajeDebajo);
        System.out.println("...porcentaje por encima: "+porcentajeEncima);
        System.out.println("");
        System.out.println("Porcentaje mayor de edad: "+porcentajeMayor);
        System.out.println("Porcentaje menor de edad: "+porcentajeMenor);
        
        
        
    }
}
