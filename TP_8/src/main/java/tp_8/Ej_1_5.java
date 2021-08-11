/*
Desarrolle pseudocódigo que tenga la 
capacidad de convertir el valor de pesos a Dólares, 
de pesos a Euros, de pesos a Reales o si no respeta 
caso alguno avisar que no hay conversión disponible. 
Considere la tasa de cambio actual (57 pesos equivale 
a un dólar, 61.8 pesos equivalen a un Euro y 13.6 pesos 
equivalen a un Real). El programa solicita la cantidad 
en pesos para luego optar por convertirlo a la 
moneda que desee el usuario según seleccione en un menú.
 */
package tp_8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double peso, dolar, euro, real;
        String moneda = null;
        String str  = moneda;
        
        System.out.println("Ingrese el valor en pesos a convertir:");
        peso= sc.nextDouble();
        
        System.out.println("Seleccione la moneda: ");
        System.out.println("Dolar");
        System.out.println("Euro");
        System.out.println("Real");
        
         str = sc.next();
         str = str.toLowerCase();
        //System.out.println(str.toLowerCase());
        
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
            default:
                System.out.println("no se encuenta el tipo de moneda mencionado");       
        } 
    }
}
