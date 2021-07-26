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
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer= new Scanner(System.in);
        //Se crea una variable cadena (String) que se utiliza para leer los datos del usuario
        String nombre;
        //muestra el msj por pantalla
        System.out.println("Ingresa tu nombre");
        //leemos el nombre la persona y lo guardamos en la variable
        nombre=leer.next();
        //mostramos por consola un saludos mas lo guardado en la variable
        System.out.println("Hola mundo, soy " + nombre);
     
    }
    
}
