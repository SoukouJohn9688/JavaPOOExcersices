/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
public class ServicioCurso {
    Curso cur=new Curso();
    
    public void cargarAlumnos(){
        Scanner leer=new Scanner(System.in);
        String[] alumnitos=new String[5];
        System.out.println("Proceda a ingresar los nombres de los 5 alumnos.");
        for (int i = 0; i < cur.getAlumnos().length; i++) {
            alumnitos[i]=leer.nextLine();
        }
        cur.setAlumnos(alumnitos);
    }
    
    public void crearCurso(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los datos del curso: ");
        System.out.println("Nombre: ");
        cur.setNombreCurso(leer.nextLine());
        System.out.println("Cantidad de horas por dia: ");
        cur.setCantidadHorasPorDia(leer.nextInt());
        leer.nextLine();
        System.out.println("Cantidad de dias por semana: ");
        cur.setCantidadDiasPorSemana(leer.nextInt());
        leer.nextLine();
        System.out.println("Turno");
        cur.setTurno(leer.nextLine());
        System.out.println("Precio por hora: ");
        cur.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos();
    }
    public void calcularGananciaSemanal(){
        System.out.println("Las ganancias a las semana son: ");
        double gananciasTotales=cur.getAlumnos().length*cur.getCantidadDiasPorSemana()*cur.getCantidadHorasPorDia()*cur.getPrecioPorHora();
        System.out.println(gananciasTotales);
    };
}
