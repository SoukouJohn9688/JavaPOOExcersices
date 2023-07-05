/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooex09;

import Entidad.Matematica;
import Servicios.ServicioMatematica;

/**
 *
 * @Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Pooex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica operacionsilla=new Matematica();
        operacionsilla.setNum1(Math.random()*100);
        operacionsilla.setNum2(Math.random()*100);
        
        ///Ejecucion de metodos:
        double resultado=ServicioMatematica.devolverMayor(operacionsilla);
        System.out.println("La potencia del numero mayor es: "+ServicioMatematica.calcularPotencia(resultado));
    }
    
}
