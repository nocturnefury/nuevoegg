/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author fabri
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un número:");
    int n1 = leer.nextInt();
    System.out.println("Ingrese otro número:");
    int n2 = leer.nextInt();
    esMultiplo(n1,n2);
   
    }
    public static void esMultiplo(int n1,int n2){
	if (n1%n2==0 || n2%n1==0){            
            System.out.println(n2+ " es multiplo de " + n1);     
        }else{
             System.out.println(n2+ " No es multiplo de " + n1);
        }       
 
    }
}
    
