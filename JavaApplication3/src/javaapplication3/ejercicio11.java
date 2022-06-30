/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
import static javaapplication3.ejercicio11.ffrase;
/**
 *
 * @author fabri
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase y termine con un punto: ");
        int frase = leer.nextInt();
        System.out.println("Su frase quedaria así:");
        int retorno = ffrase(frase);
        System.out.println(retorno);
    }
    

    public static int ffrase (int frase){
              int ffrase;
    Scanner leer = new Scanner(System.in);
        return 0;
        
    }
}
     