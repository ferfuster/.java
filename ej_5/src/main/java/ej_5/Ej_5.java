/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_5;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> test = new ArrayList<>();
        test.add("Hola");
        test.add("dia");
        test.add("perro");
        
        System.out.println(test.get(2));
        System.out.println(test.get(0));
        
        Cuenta c1= new Cuenta();
        c1.setSaldo(0);
        c1.setNumetoDeCuenta("ABCD1234");
        
        Cuenta c2= new Cuenta();
        c2.setSaldo(700);
        c2.setNumetoDeCuenta("4321DCBA");
        
        ArrayList<Cuenta> arrCuenta = new ArrayList<Cuenta>();
        
        System.out.println(arrCuenta.size());
        arrCuenta.add(c1);
        arrCuenta.add(c2);
        
        System.out.println(arrCuenta.size());
    }
    
}
