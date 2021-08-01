/*
Diseñar pseudocódigo para calcular y 
mostrar el área de un rectángulo.
El programa tiene que solicitar los datos de 
entrada necesarios para poder realizar 
la operación adecuadamente.
 */
package tp_8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        
        System.out.println("Ingrese la medida de la base en cm:");
        
        base = sc.nextDouble();
        
        System.out.println("Ingrese la medida de altura en cm:");
        
        altura = sc.nextDouble();
        
        System.out.println("La superficie del rectangulo es de: " + base*altura+" cm2");
        
        
    }
    
}
