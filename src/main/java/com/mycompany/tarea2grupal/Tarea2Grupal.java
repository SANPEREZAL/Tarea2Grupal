/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea2grupal;

/**
 *
 * @author Santiago Perez y Nemeque (<--ponga aqui su nombre xd)
 */
import java.util.Scanner;
public class Tarea2Grupal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Escriba su edad: ");
        
        String edad = scanner.nextLine();
        
        int a = Integer.parseInt(edad);
        float b = Float.parseFloat(edad);
        double c = Double.parseDouble(edad);
        
        System.out.println("Su edad convertida a integer es: " + a);
        System.out.println("Su edad convertida a float es: " + b);
        System.out.println("Su edad convertida a double es: " + c);
        
        System.out.println("Escriba su numero de telefono; ");
        
        int telefono = scanner.nextInt();
        
        String num = Integer.toString(telefono);
        
        System.out.println("Su numero telefonico convertido a str es: " + num);
        
        
        
        
    }
}
