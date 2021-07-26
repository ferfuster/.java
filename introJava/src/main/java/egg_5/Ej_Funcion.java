/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_Funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int resultado = suma(9,10);
        
        System.out.println(resultado);
        saludoPersonalizado("fernando");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();
        saludoPersonalizado(leer.next());
    }
    public static int suma(int a, int b ){
        //logica
        int c = a+b;
                return c;
                
    }
    
    public static void saludoPersonalizado(String nombre){
        System.out.println("Hola " + nombre + " como estas?");
    }
}
