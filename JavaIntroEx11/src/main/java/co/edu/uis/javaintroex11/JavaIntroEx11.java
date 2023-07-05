/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.uis.javaintroex11;

import java.util.Scanner;


/**
 *
 * @author jupac
 */
public class JavaIntroEx11 {

    public static void main(String[] args) {
       
        
        
//        EJERCICIO 11
//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
//en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
//reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
//vocales acentuadas) se mantienen sin cambios.
//a e i o u
//@ # $ % *
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//correspondiente. Utilice la estructura “según” para la transformación.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
          
        Scanner leer=new Scanner(System.in);
        
        
       System.out.println("Hey man, gimme da sentence!!!!");
       
       String frase=leer.nextLine();
       System.out.println(frase);
       
        ;
        
      
       System.out.println(codificarFrase(frase));
        
        
     
       
    }
    public static String codificarFrase(String frasesilla)
    {
        // Creating an object of String class
         char[] ch = frasesilla.toCharArray();
       for (int i=0;i<frasesilla.length();i++){
           switch (ch[i]) {
               case 'a':
                    ch[i]='@';
                     break;
               case 'e':
                    ch[i]='#';
                     break;
               case 'i':
                    ch[i]='$';
                     break;
               case 'o':
                    ch[i]='%';
                     break;
               case 'u':
                    ch[i]='*';
                   break;
              
           }
       }
        frasesilla=String.valueOf(ch);
        return frasesilla;
    }
    
    
    
    
}
