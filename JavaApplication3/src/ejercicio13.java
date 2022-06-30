
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabri
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("ingrese la cantidad de integrantes del grupo:");
        int canteq=leer.nextInt();
        int i = 0;
        int k = 0;
        int[] Equipo = new int[canteq];
        for (int j = 0; j < Equipo.length; j++) {
             System.out.println("ingrese nombre del integrante "+ i++);
            String name = leer.next();
            System.out.println("ingrese edad del integrante "+ k++);
            int edad  = leer.nextInt();
            //continue;
        }
 
    }
    
}
