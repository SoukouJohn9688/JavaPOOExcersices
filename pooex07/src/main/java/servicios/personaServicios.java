/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
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
public class personaServicios {
    
   private static Scanner leer=new Scanner(System.in);
    
    
    
     /**
      * Metodo para crear una persona
      */
    public static Persona crearPersona(){
        System.out.println("Ingrese los datos de la persona en el orden: ");
        System.out.println("Nombre,edad,sexo,peso,altura.");
        Persona p=new Persona();
        p.setNombre(leer.nextLine());
        p.setEdad(leer.nextInt());
        leer.nextLine();
        p.setSexo(leer.nextLine());
        p.setPeso(leer.nextDouble());
        leer.nextLine();
        p.setAltura(leer.nextDouble());
        leer.nextLine();
        return p;
        
    
    }
    
    public static int calcularIMC(double peso,double altura){
        double calculo=peso/(Math.pow(altura, 2));
        if(calculo<20){
            System.out.println("Peso debajo de lo ideal.");
            return -1;
        }
        else if(calculo>=20 || calculo<=25){
            System.out.println("Se encuentra en el peso ideal");
            return 0;
            
        }
        System.out.println("Estas gordito, mi viejo!");
        return 1;
    }
    
    public static boolean esMayorDeEdad(int edad){
    if(edad>=18){
        System.out.println("Ya estas viejo");
        return true;
    }
        System.out.println("Eres un neonato");
    return false;
    }
}
