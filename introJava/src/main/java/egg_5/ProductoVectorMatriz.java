/*
Realizar la multiplicacion de un vector por una matriz
dado el vector 1*N y una matriz N*M, el resultado del producto es 1*M
Ej. vector 1*2 matriz 2*3 = producot 1*3

v= |3,5| * m=|4,8,6| = |4*3+5*2 , 3*8+5*1 , 3*6+5*7| = |22,29,53|
             |2,1,7| 
 */
package egg_5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class ProductoVectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion y creacion de un vector
        //tipo [] nombreVector = new tipo[Tamaño];
        
        //Declarar un arreglo de una dimension
        int[] vector;
        //crear en memoria (construir/dimensionar) con el valor por defecto (cero para los enteros)
        vector = new int[2];
        //los dos pasos en una linea
        int[] producto = new int [3];
        //declaracion y creacion de una matriz
        //tipo[][] nombreMatriz= new tipo [filas] [columnas];
        
        //declaracion e inicializacion con los valores predeterminados
        int[] [] matriz = {{4,8,6},{2,1,7}};
        
        //declaracion y creacion de arreglos numericos 
        //tipo [][]...[] nombreArreglo = new tipo[cardanilidad 1][cardanilidad 2]... [cardinalidad N];
        
        System.out.println("Ingrese los valores del vector de tamaño "+vector.length + " :");
        Scanner leer = new Scanner (System.in);
        //int =0, porque los subindices de los arreglos en Java inician en cero
        for (int i=0; i<vector.length; i++){
            System.out.println("v["+i+"]=");
            //acceder al valor i de vector
            vector[i]= leer.nextInt();
        }
        //multiplica vector por matriz
        int sum;
        //...para cada columna de la matriz..
        for (int j=0; j<matriz[0].length; j++) {
            sum =0;
            //..recorro el vector y multiplico
            for (int i=0; i<vector.length; i++){
                sum += vector[i]*matriz [i][j];
            }
            producto[j] = sum;
        }
        String aux ="";
        //mostrar vector
        System.out.println("* vector:");
        //bucle for "mejorado" (enhanced)
        //for (tipo elemento :arreglo)
        for (int elemento : vector){
            aux = aux + "  "+ elemento;
           }
        System.out.println("aux");
        
        //mostrar matriz
        System.out.println("\n* Matriz");
        //para cada fila de la matriz
        for (int [] fila:matriz){
            aux ="";
            //para cada elemento de la fila
            for (int elemento : fila){
                aux += " " + elemento;// es igual a  aux = aux + "  "+ elemento;
            }
            System.out.println(aux);
        }
        //mostrar resultado
        aux= "";
        System.out.println("\n* Vector x Matriz:");
        for (int elemento : producto){
            aux += " "+ elemento;
        }
        System.out.println(aux);
        }
    }
    

