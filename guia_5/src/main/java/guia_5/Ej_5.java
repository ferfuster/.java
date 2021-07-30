/*
Dada una cantidad de grados centígrados 
se debe mostrar su equivalente en
grados Fahrenheit. La fórmula 
correspondiente es: F = 32 + (9 * C / 5).
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int grados;
        int convertir;
        
        System.out.println("Ingrese los grados Centigrados a convertir:");
        grados= sc.nextInt();
        
        convertir= 32 + (9* grados/5);
        System.out.println("Equivalen a "+ convertir+" F°");
        
        
    }
    
}
