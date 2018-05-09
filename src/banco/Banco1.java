/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Alumnos
 */
public class Banco1 {
    public Cuenta cuentas[];
    
    public Banco1(int cantidadDeCuentas){
        this.cuentas = new Cuenta[cantidadDeCuentas];
    } 
     
    public Cuenta buscar(String numeroDeCuenta ){
        for (int a=0; a<this.cuentas.length; a++){
            if(this.cuentas[a]!= null){
                if( this.cuentas [a].numero.equals(numeroDeCuenta)){
                    return this.cuentas[a];
                }
                
            }
        }    
       return null; 
    }
    
    public void depositar(double cantidad, String numeroDeCuenta){
        Cuenta cuenta = this.buscar(numeroDeCuenta);
        if (cuenta != null) {
            cuenta.Depositar(cantidad);   
        }else{
            System.out.println("No se encontro una cuenta con número: " + numeroDeCuenta);
        }
    }
    
    public void debitar(double cantidad, String numeroDeCuenta){
       Cuenta cuenta = this.buscar(numeroDeCuenta);
        if (cuenta != null) {
             cuenta.debitar(cantidad);   
        }else{
            System.out.println("No se encontro una cuenta con número: " + numeroDeCuenta);
        }
    }
    public void imprimir (String numeroDeCuenta){
       Cuenta cuenta = this.buscar(numeroDeCuenta);
       System.out.println(cuenta.numero+"-"+ cuenta.Titular+"-"+ cuenta.Saldo);
        
    }
}
