/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
public class ServicioNIF {
    
    NIF nif=new NIF();
    Scanner leer=new Scanner(System.in);
   
    public void crearNif(){
        long resto=0;
        int i=0;
        
        String[] arregloDNI={"T","R","W","A","G","M",
                             "Y","F","P","D","X","B",
                             "N","J","Z","S","Q","V",
                             "H","L","C","K","E"};
        
        System.out.println("Ingrese numero de DNI: ");
        nif.setDNI(leer.nextLong());
        leer.nextLine();
        resto=nif.getDNI()%23;
        
        
        while(i<arregloDNI.length){
            if(resto==i){
            nif.setLetra(arregloDNI[i]);
            } 
        i++;
        } 
    }
    
    
    
    public void mostrar(){
        System.out.println(nif.getDNI()+"-"+nif.getLetra());
    }
    
}
