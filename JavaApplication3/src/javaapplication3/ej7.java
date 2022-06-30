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
public class ej7 {
    public static void main(String[] args){
      Scanner leer = new Scanner(System.in);
      
    int tipomotor;
    System.out.println("que tipo de motor quisiera ver: ");
    System.out.println("1) La bomba es una bomba de agua");
    System.out.println("2) La bomba es una bomba de gasolina");
    System.out.println("3) La bomba es una bomba de hormigón");
    System.out.println("4) La bomba es una bomba de pasta alimenticia");
        tipomotor = leer.nextInt();
    switch (tipomotor){
        case 1:
            System.out.println("La bomba es una bomba de agua");
            break;
        case 2:
            System.out.println("La bomba es una bomba de gasolina");
            break;
        case 3:
            System.out.println("La bomba es una bomba de hormigón");
            break;
        case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
        default:
            System.out.println("No existe un valor valido para tipo de bomba");
            break;
    }
    
    }
}