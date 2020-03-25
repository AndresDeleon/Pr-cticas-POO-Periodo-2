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
public class Trompeta extends InstrumentoMusical {
    public Double tamaño;
    public Trompeta(Double p, Integer a, String t, String m, Double ta){
        super(p, a, t, m);
        this.tamaño = ta;
    }
    public void afinarTrompeta(){
        System.out.println("La trompeta está siendo afinada");
    }
}
