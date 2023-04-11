/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raizcuadrada;
import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class RAIZCUADRADA {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Porfavor ingrese el numero");
        num1 = leer.nextByte();
     
     System.out.println("El numero introducido es: " + num1);
     System.out.println("doble de " + num1 + " -> " + 2 * num1);
     System.out.println("triple de " + num1 + " -> " +3 * num1);
     System.out.println("la raiz cuadrada es " + num1 * num1);
        
       
    
        
    }
}
