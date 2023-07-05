/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexguia;

/**
 *
 * @Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
public class Ex12 {
    public static void main(String[] args) {
        //contador();
        contador2();
    }
    
    public static void contador(){
    int cont1=0;
    int cont2=0;
    int cont3=0;
    String conversor="E",conversor2="E",conversor3="E";
    
    while(cont3<=9){
        cont1++;
        if(cont1==3){
            System.out.println(cont3+"-"+cont2+"-"+conversor);
        }
        /////////// cont 2
        if(cont1>9){
            cont1=0;
            cont2++;
            if(cont2==3)System.out.println(cont3+"-"+conversor2+"-"+cont1);
        ////////// cont 3
        }else if(cont2==9){
            cont2=0;
            cont3++;
            if(cont3==3)System.out.println(conversor3+"-"+cont2+"-"+cont1);
        }
        if(cont1!=3 && cont2!=3 && cont3!=3){
        System.out.println(cont3+"-"+cont2+"-"+cont1);
        }
        
    }
    }
    
    public static void contador2(){
      
    String conversor="E",conversor2="E",conversor3="E";
    
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    conversor="E";
                    conversor2="E";
                    conversor3="E";
                    if(i!=3){
                    conversor3=Integer.toString(i);
                    }
                    if(j!=3){
                    conversor2=Integer.toString(j);
                    }
                    if(k!=3){
                    conversor=Integer.toString(k);
                    }
                    System.out.println(conversor3+"-"+conversor2+"-"+conversor);
                }
            }
        }
}
}


