/*
 Escribir un programa que pida tu nombre, 
lo guarde en una variable y lo muestre
por pantalla.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       
       String nombre;
       
        System.out.println("Ingrese su nombre y apellido:");
        
        nombre= sc.nextLine();
        
        System.out.println("Su nombre es: "+ nombre);
        
       
        
    }
    
}
