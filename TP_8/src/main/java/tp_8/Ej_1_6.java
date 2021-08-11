/*
Realice las modificaciones necesarias al ejercicio 5 de esta 
guía práctica para poder ingresar reiteradas veces valores 
en pesos y convertirlos a otra moneda o bien poder 
elegir la opción 0 para salir del programa. *
 */
package tp_8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        double peso, dolar, euro, real;
        String moneda = null;
        String str  = moneda;
        boolean salir = false;
        
        do{
        System.out.println("Ingrese el valor en pesos a convertir:");
        peso= sc.nextDouble();
        System.out.println("Seleccione la moneda: ");
        System.out.println("Dolar");
        System.out.println("Euro");
        System.out.println("Real");
        System.out.println("o bien O (Cero) para Salir");
         str = sc.next();
         str = str.toLowerCase();
        
        switch (str) {
            
             case "dolar":
                 System.out.println("Su moneda equivale a U$D "+ peso/57);
                break;
  
             case"euro":
                 System.out.println("Su moneda equivale a EUR "+peso/61.8);
                break;
        
        
             case "real":
                 System.out.println("Su moneda equivale a R "+peso/13.6);
                break;
                 
             case "0":
                   System.out.println("chau");
                    salir = true;
                      break;
             default:
                 System.out.println("No se encuentra la moneda seleccionada");
                 break;
        } 
        }
         while (!salir) ; 

        }
}
  
