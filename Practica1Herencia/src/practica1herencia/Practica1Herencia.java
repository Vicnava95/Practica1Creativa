/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1herencia;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author venm9
 */
public class Practica1Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        
        System.out.println("Ingrese los datos del Cliente ");
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine(); 
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el DUI: ");
        String dui = scanner.nextLine();
        System.out.println("Ingrese el código del cliente: ");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el reclamo: ");
        String reclamo = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        Integer edad = scanner.nextInt();
        Cliente cliente = new Cliente(nombre,apellido,edad,dui,codigo,reclamo);
        System.out.println(cliente.toString());
        
    }
    
}
