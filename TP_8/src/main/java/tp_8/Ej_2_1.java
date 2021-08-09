/*
Hacer un pseudocódigo que despliegue 
la tabla de multiplicar de cierto número.
 */
package tp_8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int numA, resultado;
        
        System.out.println("Ingrese el numero a multiplicar:");
        numA = sc.nextInt();
         for (int i = 1; i <= 10; i++) {
           resultado= numA *i;
             System.out.println("Resultado de "+numA+" x "+i+" = "+resultado);
        }
        
    }
    
}
