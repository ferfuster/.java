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
public class SumatoriaConSalto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner(System.in);
      do{
            System.out.println("Ingrese el numero entero positivo");
            num = leer.nextInt();
            if(num > 100){
                System.out.println("Este programa podria tardar");
                String confirma = leer.next();
                if(confirma.equals("s")){
                    break; //Detiene el bucle y continua con el prox bloque
                }
            }
        
      }while (num <= 0 || num > 1000);
      
      int j, suma;
      for(int i=1; i<=num; i++){
          if (i%2 != 0)
              continue;
          
          suma=0;
          j=1;
          while(j<=i){
              suma += j;
              j++;
          }
      System.out.println("la suma de los "+ i +" num naturales es: "+ suma);
    }
    
}}
