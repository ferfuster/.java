/*
 Escribir un programa que pida una frase y 
la muestre toda en mayúsculas y
después toda en minúsculas. Nota: 
investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase de su preferencia:");
        
        frase= sc.nextLine();
        System.out.println(" LA FRASE EM MINUSCULA : "+frase.toLowerCase());
        System.out.println("la frase en mayuscula: "+frase.toUpperCase());
        
        
        
    }
    
}
