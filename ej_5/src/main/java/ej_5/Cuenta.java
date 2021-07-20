/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_5;

/**
 *
 * @author Fernando
 */
public class Cuenta {
    public String numeroDeCuenta;
    public int saldo;
    
    public void setNumetoDeCuenta(String numero_de_cuenta){
        this.numeroDeCuenta= numero_de_cuenta;
    }
    public String getNumeroDeCuenta(){
    return this.numeroDeCuenta;
    }
    
    public void setSaldo (int saldo){
        this.saldo=saldo;
    }
    public int getSaldo(){
        return this.saldo;
    }
}
