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
public class Informática extends Empresa{
    public Integer cantComputadoras;
    
    public Informática(Integer cE, String u, String d, Double i, Integer cC){
        super(cE, u, d, i);
        this.cantComputadoras = cC;
    }
    
    public void revisarSistema(){
        System.out.println("Se está revisando el sistema");
    }
    
    public void mantEquipo(){
        System.out.println("Se le está dando mantenimiento al equipo");
    }
}
