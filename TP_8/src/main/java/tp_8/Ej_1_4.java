/*
 Crear pseudocódigo que solicite a un 
usuario 3 notas de calificaciones, luego las analice 
mediante operadores y determine si un alumno aprobó o no.
Se deben solicitar los datos necesarios y mostrarlos por pantalla.
Para considerar aprobado al alumno, 
el promedio de las 3 notas debe ser mayor o igual a 6.
 */
package tp_8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //double nota;
        System.out.println("Ingrese tres notas de calificaciones:");
        
        double numA = sc.nextDouble();
        double numB = sc.nextDouble();
        double numC = sc.nextDouble();
        double nota = numA + numB + numC;
        if (nota/3 >=6) {
            System.out.println("Alumno aprobado [nota: "+ nota/3 +"]");
            
        } else {
             System.out.println("Alumno no aprobado [nota: "+ nota/3 +"]");
            
        }
        
        
    }
    
}
