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
public class Empleado extends Persona{
    private double salario;

    public Empleado() {
        super();
    }

    public Empleado(String nombre, String apellido, int edad, String dui, double salario) {
        super(nombre,apellido,edad,dui);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario: " + salario;
    }
      
    
    
}
