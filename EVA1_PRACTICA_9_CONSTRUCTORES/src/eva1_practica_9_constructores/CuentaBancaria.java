/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_9_constructores;

/**
 *
 * @author Familia
 */
public class CuentaBancaria {
    private int noCuenta;
    private double saldo;
    private String Cliente;
   
    //CONSTRUCTOR DEFAULT (SIN ARGUMENTOS)
    public CuentaBancaria(){
        noCuenta = 0;
        Cliente = "Sin Cliente";
        saldo = 1000000;
        
    }
    
    //get y set
    public int getNoCuenta(){
        return noCuenta;
    
    }
    public void setNoCuenta(int cuenta){
        noCuenta = cuenta;
        
    }
    public String getCliente(){
        return Cliente;
        
    }
    public void setCliente(String noCuenta){
        Cliente = noCuenta;
        
    }
    public double getSaldo(){
     return saldo;
     
    }
    
    public void retirar(double monto){
        if(saldo >= monto) 
        saldo = saldo -monto;
    }
    public void depositar(double depositar){
        saldo = saldo + depositar;
    }

    
}
