/*
 Escribir un programa que pida dos números enteros 
 por teclado y calcule la suma
 de los dos. El programa deberá después 
 mostrar el resultado de la suma
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int numA;
        int numB;
        int numC;
        
        System.out.println("Ingrese los valores a sumar: ");
        numA = leer.nextInt();
        numB = leer.nextInt();
        
        numC = numA + numB;
        
        System.out.println("La suma de "+numA+" y "+numB+" es igual a  "+numC);
        
    }
    
}
