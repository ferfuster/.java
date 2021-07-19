/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp_10_ej_01;

/**
 *
 * @author Fernando
 */
public class Rectangulo {

    public int base;
    public int altura;

    /*constructor es un metodo que tiene 
    *el mismo nombre de la clase
     */
    public Rectangulo() {
    }
    
    //Metodo para el calculo del area
public int calcularArea(){
return base * altura;
        }

    //Metodo para el calculo del perimetro
public int calcularPerimetro(){
    int perimetro= base*2 + altura*2;
    return perimetro;
}
}
