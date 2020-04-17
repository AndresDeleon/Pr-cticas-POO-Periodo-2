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
public class Roedores extends Mascota{
    
    public Boolean cola;
    public String forma;
    public String color;
    
    public Roedores(String n, String e, Boolean ca, String f, String cr){
        super(n, e);
        this.cola = ca;
        this.forma = f;
        this.color = cr;
    }
    
    @Override
    void dormir(Integer tiempo){
        JOptionPane.showMessageDialog(null, "El roedor " + this.nombre + " durmió por " + tiempo.toString() + "h.");
    }
    
    @Override
    void comer(Double cantComida, Integer cantVeces){
        JOptionPane.showMessageDialog(null, "El roedor " + this.nombre + " comió " + cantComida.toString() + " lb, por " + cantVeces.toString() + " veces en el día.");
    }
    
    void movimiento(Integer min){
        JOptionPane.showMessageDialog(null, "El roedor " + this.nombre + " corrió en su rueda por " + min.toString() + " min.");
    }
    
    void jugarLaberinto(){
        JOptionPane.showMessageDialog(null, "El roedor " + this.nombre + " está recorriendo el laberinto. Esperemos que encuentre la salida...");
    }
    
    void emitirSonido(Integer tiempo){
        JOptionPane.showMessageDialog(null, "El roedor " + this.nombre + " chilló por " + tiempo.toString() + " segundos.");
    }
}
