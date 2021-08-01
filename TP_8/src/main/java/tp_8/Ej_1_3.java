/*
Diseñar un programa que pida al usuario 
mediante su teclado que ingrese 5 números.
Debe poder mostrar el promedio de los 5 números 
ingresados por pantalla con un mensaje final como 
“El promedio de los 5 números ingresados es …..“.
 */
package tp_8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        {

        double numer, suma = 0;
        double promedio;
        for (int i = 0; i < 5; i++) {
           System.out.println("Ingrese el "+ (i+1) +"° numero");
           numer = sc.nextInt();
           suma = suma + numer;
        }  
        promedio= suma/5;
        System.out.println("El promedio de los 5 números ingresados es: "+promedio);
        }
    }
    
}
