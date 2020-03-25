/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_1;

/**
 *
 * @author aeld
 */
public class Piano extends InstrumentoMusical {
    public Integer cantTeclas;
    
    public Piano(Double p, Integer a, String t, String m, Integer cT){
        super(p, a, t, m);
        this.cantTeclas = cT;
    }
    public void probarteclas(){
        System.out.println("El piano está siendo probado");
    }
}
