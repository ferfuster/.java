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
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int opinion;
            Scanner leer = new Scanner(System.in);
            System.out.println("Clasifique la pelicula d 1 a 5 estrellas");
            opinion = leer.nextInt();
            
            if (opinion>=1 && opinion <=5){
                switch(opinion){
                    case 1:
                    case 2:
                        System.out.println("Pucha, que pena");
                        break;
                    case 3:
                        System.out.println("Pelicula Buena");
                        break;
                    case 4:
                        System.out.println("Has calificado como Muy Buena");
                        break;
                    case 5:
                        System.out.println("Excelente");
                        break;    
                }
            }else if (opinion<0){
                System.out.println("'¿una opinion negatica?");
            }else if (opinion==0){
                System.out.println("El valor "+opinion+ " no es valido");
            }else{
                System.out.println(opinion+" muy buena calificacion!..");
            }System.out.println("Hasta la Proxima");
        }
        
    }
