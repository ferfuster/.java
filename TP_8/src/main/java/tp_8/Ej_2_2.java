/*
Diseñar un algoritmo que determine cuál es el mayor número de una
serie ingresada por teclado.
Se debe pedir al usuario la cantidad de números a ingresar antes de
que ingrese la serie de datos.
Además el programa debe determinar cuál es el menor valor de
todos los datos ingresados.
 */
package tp_8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i, qNum = 0;
        int [] numA = new int [qNum];
        System.out.println("ingrese la cantdad :");
        qNum = sc.nextInt();
        for ( qNum = 0; qNum < numA.length; qNum++) {
            System.out.println("Ingrese el numero:"+qNum);
           numA [qNum]= sc.nextInt();
        }
        for ( i = 0; i < numA.length; i++) {
            System.out.println(numA[i]);
        }
    }
    
}
