/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

/**
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class Ex2 {
    
    
    
    public static void transmogrificacion(){
        int A=1,B=6,C=21,D=54;
        int aux=0;
        aux=B;
        System.out.println("Valores iniciales: ");
        
        System.out.println("A: "+A+" B: "+B+" C: "+C+" D: "+D);
        
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("Valores Finales: ");
        System.out.println("A: "+A+" B: "+B+" C: "+C+" D: "+D);
        
        
    }
        
    
}
