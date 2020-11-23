/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author venm9
 */
public class CuentaBancaria {
    
    private String nombreCliente;
    private String numCuenta;
    private double tipoInteres;
    private double saldo;

    //Constructor por defecto
    public CuentaBancaria() {
    }
    //Constructor con todos los parámetros
    public CuentaBancaria(String nombreCliente, String numCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numCuenta = numCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    //Constructor Copia
    public CuentaBancaria(final CuentaBancaria cuenta){
        nombreCliente = cuenta.nombreCliente;
        numCuenta = cuenta.numCuenta;
        tipoInteres = cuenta.tipoInteres;
        saldo = cuenta.saldo;
    }
    
    //Métodos setters/getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Nombre del cliente: " + nombreCliente + 
                "\nNúmero de cuenta: " + numCuenta + 
                "\nTipo de interés: " + tipoInteres + 
                "\nSaldo: " + saldo;
    }
    
    
  
}
