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
public class Cuenta {
    public String Titular;
    public double Saldo;
    public String numero;

    public Cuenta(String Titular, double saldoInicial, String numero){
        this.Titular= Titular;
        this.numero =  numero;
        if(saldoInicial>0){
            this.Saldo=saldoInicial;
            
        }
        else{
            this.Saldo=0;
        }
    }
    
    public void debitar(double retiro){
        if(this.Saldo>retiro){
            this.Saldo=this.Saldo-retiro;
        }
        else{
            System.out.println("Su saldo es insuficiente");
        }
    }
    
    public void Depositar (double deposito){
        this.Saldo = this.Saldo + deposito;
    }
    
    
    
    
}
