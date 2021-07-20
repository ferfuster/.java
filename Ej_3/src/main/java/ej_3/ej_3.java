/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_3;

import java.util.Scanner;

/*
Crear una clase Auto, a través de la cual se pueda conocer el color
del auto, la marca, el modelo, el número de patente, el número de
puertas y la matrícula. Crear el constructor del coche, así como los
métodos que considere necesarios.
*/

/**
 *
 * @author Fernando
 */
public class ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Auto x = new Auto();
     
        x.setColor();
        x.setMarca();
        
    }
    
}
