/*
 Crear un programa capaz de poder ingresar notas de una cantidad de alumnos
(N). Para cada alumno se debe poder calcular el promedio de 3 notas (o si fuera el
caso de un programa más dinámico, de x notas).
Cuando se ingresen los datos de notas de cada alumno el programa debe poder
identificar y mostrar mensajes para avisar que el alumno está aprobado o si tiene
que rendir un recuperatorio final.
 */
package tp_8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ej_1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int alumno, i, j;
        float qNotas, nota, promedio, suma=0;
        
        
        System.out.println("Ingrese el número de alumnos a evaluar:");
        alumno = sc.nextInt();
        
        System.out.println("ingrese la cantidad de notas evaluadas:");
        qNotas = sc.nextFloat();
        
        for ( i = 0; i < alumno; i++) {
            System.out.println("Alumno N° "+(i+1));
            for (j = 0; j < qNotas; j++) {
                System.out.println("ingrese la "+(j+1)+"° nota evaluada");
                nota = sc.nextFloat();
                suma += nota;
            }
            promedio = suma/(qNotas);
            System.out.println("El promedio de notas es: "+promedio);
            if (promedio > 50) {
                System.out.println("Alumno Aprobado");
            } else {
                System.out.println("Debe rendir recuperatorio final");
            }
            suma=0;
        }
    }
    
}
