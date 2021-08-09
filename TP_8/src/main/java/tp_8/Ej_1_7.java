package tp_8;

import java.util.Scanner;

/*
 Realice pseudocódigo que solicite a un usuario que ingrese 3 números.
El programa debe poder identificar si los 3 números son distintos. Si no fueran
distintos debe indicar mediante un mensaje por pantalla cuál de los 3 números
ingresados coincide con otro ingresado.
 */

/**
 *
 * @author Fernando
 */
public class Ej_1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese tres numeros diferentes:");
        int numA= sc.nextInt();
        int numB= sc.nextInt();
        int numC= sc.nextInt();
        
        if(numA != numB && numB != numC && numA!= numC){
            System.out.println("los números: "+numA +"; "+numB+"; "+numC +" son correctos");
        }else if (numA == numB){ 
            System.out.println("incorrecto. Se repite el número: "+numA);
        }else if(numA == numC){
            System.out.println("incorrecto. Se repite el número: "+numA);
        }else if(numB == numC){
            System.out.println("incorrecto. Se repite el número: "+numB);
        }else{
            System.out.println("los valores no son correctos");
        }
        
    }
    
}
