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
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String dui;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String dui) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dui = dui;
    }
    
    public Persona(final Persona persona){
        nombre = persona.nombre;
        apellido = persona.apellido;
        edad = persona.edad;
        dui = persona.dui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String toString() {
        return "Nombre: " +  nombre + "\tApellido: " + apellido + "\nEdad: " + edad + "\nDUI: " + dui;
    }
    
    
    
}
