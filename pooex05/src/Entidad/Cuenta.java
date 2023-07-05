/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jupac
 */
public class Cuenta {
    
    public static int numeroCuenta;
    public static long DNI;
    public static int saldo;
    public static int interes;

   
    public Cuenta(int numeroCuenta,long DNI,int saldo,int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.interes = interes;
    }

    public Cuenta() {
    }

    public static int getNumeroCuenta() {
        return numeroCuenta;
    }

    public static void setNumeroCuenta(int numeroCuenta) {
        Cuenta.numeroCuenta = numeroCuenta;
    }

    public static long getDNI() {
        return DNI;
    }

    public static void setDNI(long DNI) {
        Cuenta.DNI = DNI;
    }

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        Cuenta.saldo = saldo;
    }

    public static int getInteres() {
        return interes;
    }

    public static void setInteres(int interes) {
        Cuenta.interes = interes;
    }
    
    
    
}
