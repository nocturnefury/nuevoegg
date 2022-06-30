/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int respuesta = 11;
        while (respuesta > 10 ) {
            
            System.out.println("ingrese el numero de la nota");
            respuesta = Integer.parseInt(leer.nextLine());
                   
        }
  
    }
    
}
