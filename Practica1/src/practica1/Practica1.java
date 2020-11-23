/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.io.InputStream;
import java.util.Scanner;


/**
 *
 * @author venm9
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        System.out.println("Ingrese un nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el número de cuenta:");
        String cuenta = scanner.nextLine();
        System.out.println("Ingrese el interés:");
        double interes = scanner.nextDouble();
        System.out.println("Ingrese el saldo:");
        double saldo = scanner.nextDouble();
        scanner.close();
        CuentaBancaria cuenta1 = new CuentaBancaria(nombre,cuenta,interes,saldo);
        System.out.println(cuenta1.toString());
    }
    
}
