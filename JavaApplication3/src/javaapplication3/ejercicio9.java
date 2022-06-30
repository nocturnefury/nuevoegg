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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=0,suma=0,cont=0;       
        do {
            System.out.println("ingrese un numero: ");
              num = Integer.parseInt(leer.nextLine());             
              suma=suma+num;          
              cont++;
              if (num == 0){
              System.out.println("se capturo el numero 0");
              break;
              }
        } 
        while (cont!= 20); 

            System.out.println("La suma de todos los numeros es: " + suma);
    }
    }