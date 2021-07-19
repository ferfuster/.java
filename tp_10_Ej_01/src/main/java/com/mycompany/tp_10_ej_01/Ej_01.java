package com.mycompany.tp_10_ej_01;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando Crear una clase Rectángulo, con atributos base y altura.
 * Crear también el constructor de la clase y los métodos necesarios para
 * calcular el área y el perímetro. Crear otra clase que pruebe varios
 * rectángulos y muestre por pantalla sus áreas y perímetros
 */
public class Ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rectangulo r;
        Scanner sc = new Scanner(System.in);

        r = new Rectangulo();

        r.altura = 4;
        r.base = 9;

        /* 
        System.out.println("Rectangulo con base:" + r.base);
        System.out.println("Rectangulo con Altura:" + r.altura);
        System.out.println("Rectangulo con area:"+(r.altura*r.base));
         */
        
        System.out.println("Ingrese la base del Rectangulo:");
        r.base = sc.nextInt();
        
        System.out.println("Ingrese la altura del rectangulo:");
        r.altura=sc.nextInt();
        
        System.out.println("Rectangulo con Base:"+ r.base);
        System.out.println("rectangulo con Altura:" +r.altura);
        
        int area = r.calcularArea();
        int perimetro = r.calcularPerimetro();
        
        System.out.println("Rectangulo con Area:"+ area);
        System.out.println("Rectangulo con Perimetro"+ perimetro);
    
        Rectangulo r2;
        r2 = new Rectangulo();
        
        System.out.println("Ingrese la base del 2° rectangulo:");
        r2.base =sc.nextInt();
        
        System.out.println("Ingrese la altura del 2° rectangulo:");
        r2.altura = sc.nextInt();
        
        int areaR2 = r2.calcularArea();
        int perimetroR2 = r2.calcularPerimetro();
        
        System.out.println("2° Rectangulo con area:"+areaR2);
        System.out.println("2° Rectangulo con perimetro:"+perimetroR2);
    
    }

}
