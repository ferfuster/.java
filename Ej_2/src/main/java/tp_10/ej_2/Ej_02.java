/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_10.ej_2;

/**
 *
 * @author Fernando
 */
public class Ej_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Contador c1= new Contador();
        
        c1.setValor(10);//valor ->10
        int v0 = c1.getValor();
        System.out.println("Valor: " +v0);
        
        c1.decrementar();//valor ->9
        c1.decrementar();//valor ->8
        c1.decrementar();
        c1.decrementar();
        c1.decrementar();
        c1.decrementar();//valor ->4
        
        c1.incrementar();//valor ->5
        c1.incrementar();//valor ->6
        int v=c1.getValor();
        System.out.println("Valor: "+v);
        
        c1.getValor();
        
        
        Persona x = new Persona();
        x.setApellido("Fuster");
        //x.apellido="Fuster";

        x.setNombre("Fernando");
        x.setDni("32.000.000");
        
    }
    
}
