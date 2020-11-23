/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1herencia;

/**
 *
 * @author venm9
 */
public class Cliente extends Persona{
    private String codCliente;
    private String reclamo;

    public Cliente() {
        super();
    }

    public Cliente(String nombre, String apellido, int edad, String dui,String codCliente, String reclamo) {
        super(nombre,apellido,edad,dui);
        this.codCliente = codCliente;
        this.reclamo = reclamo;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getReclamo() {
        return reclamo;
    }

    public void setReclamo(String reclamo) {
        this.reclamo = reclamo;
    }

    public String toString() {
        return super.toString() + "\nCcodigo del Cliente: " + codCliente + "\nReclamo: " + reclamo;
    }
}
