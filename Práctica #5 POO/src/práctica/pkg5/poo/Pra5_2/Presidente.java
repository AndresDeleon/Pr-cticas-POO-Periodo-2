/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_2;

/**
 *
 * @author aeld
 */
public class Presidente extends Empleado{
    public Integer diasLibres;
    
    public Presidente(String d, Double s,  Integer hT, String a, String n, Boolean dis, Integer dL){
        super(d, s, hT, a, n, dis);
        this.diasLibres = dL;
    }
    
    public void conferencia(){
        System.out.println("El presidente está en una conferencia");
    }
    
    public void delegarCargos(){
        System.out.println("El presidente está delegando los cargos");
    }
}
