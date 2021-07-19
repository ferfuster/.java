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
public class Contador {
     public int valor ;
     
    //constructor: Es el metodo principal
    public Contador(){}
    
    public Contador(int v){
        valor=v;
    }
    public int getValor(){
        return valor;
    }
   public void setValor(int v){
       valor=v;
   }
    
   
    public void decrementar(){
    valor= valor-1;
    }
    public void incrementar(){
    valor=valor+1;
    }
    
}
