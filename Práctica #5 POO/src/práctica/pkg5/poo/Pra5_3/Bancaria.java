/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_3;

/**
 *
 * @author aeld
 */
public class Bancaria extends Empresa{
    public Double deposito;
    public Integer usuarios;
    
    public Bancaria(Integer cE, String u, String d, Double i, Double de, Integer us){
        super(cE,u,d,i);
        this.deposito = de;
        this.usuarios = us;
    }
    
    public void realizarPrestamo(){
        System.out.println("Realizando un préstamo");
    }
    
    public void depositarEfectivo(){
        System.out.println("Depositando efectivo");
    }
}
