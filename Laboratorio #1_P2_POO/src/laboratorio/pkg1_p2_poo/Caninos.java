/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg1_p2_poo;
import javax.swing.JOptionPane;
/**
 *
 * @author aeld
 */
public class Caninos extends Mascota {
    public String colorPelaje;
    public Boolean colaCortada;
    public Boolean orejasPuntadas;
    
    public Caninos(String n, String e, String cP, Boolean cC, Boolean oP){
        super(n, e);
        this.colorPelaje = cP;
        this.colaCortada = cC;
        this.orejasPuntadas = oP;
    }
    
    @Override
    void dormir(Integer tiempo){
        JOptionPane.showMessageDialog(null, "El canino " + this.nombre + " durmió por " + tiempo.toString() + "h.");
    }
    
    @Override
    void comer(Double cantComida, Integer cantVeces){
        JOptionPane.showMessageDialog(null, "El canino " + this.nombre + " comió " + cantComida.toString() + " lb, por " + cantVeces.toString() + " veces en el día.");
    }
    
    public void cavar(Integer profundidad){
        JOptionPane.showMessageDialog(null, "El canino " + this.nombre + " cavó un hoyo de " + profundidad.toString() + " cm de profundidad.");
    }
    
    public void movimiento(Double vel, Integer dis){
        JOptionPane.showMessageDialog(null, "El canino " + this.nombre + " corrió a una velocidad de " + vel.toString() + " m/s, en una distancia de " + dis.toString() + " m.");
    }
    
    public void emitirSonido(Integer tiempo){
        JOptionPane.showMessageDialog(null, "El canino " + this.nombre + " ladró por " + tiempo.toString() + " segundos.");
    }

}
