/*
 Implementar un programa que dado dos 
números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numerA;
        int numerB;
        
        System.out.println("ingrese dos valores a comparar:");
       
        numerA = sc.nextInt();
        numerB = sc.nextInt();
        
        System.out.println("el valor mayor es: "+ Math.max(numerA, numerB));
                
    }
    
}
