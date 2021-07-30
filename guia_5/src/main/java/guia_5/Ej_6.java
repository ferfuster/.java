/*
Escribir un programa que lea un número entero 
por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt()
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int numerA;
        System.out.println("ingrese un numero:");
        
        numerA= sc.nextInt();
       System.out.println("el doble del numero es: "+numerA*2);
        System.out.println("El triple del numero es: "+numerA*3);
        System.out.println("La Raiz cuadrada del numero es:" + Math.sqrt(numerA));
        
        
    }
    
}
