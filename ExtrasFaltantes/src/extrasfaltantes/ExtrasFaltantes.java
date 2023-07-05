/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extrasfaltantes;

import Servicio.ServicioNIF;

/**
 *
 * @
 */
public class ExtrasFaltantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioNIF serv=new ServicioNIF();
        serv.crearNif();
        serv.mostrar();
    }
    
}
