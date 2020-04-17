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
public class Peces extends Mascota{
    public Boolean cambiaColor;
    public Boolean hermafrodita;
    public String formaRespirar;
    
    public Peces(String n, String e, Boolean cC, Boolean h, String fR){
        super(n, e);
        this.cambiaColor = cC;
        this.hermafrodita = h;
        this.formaRespirar = fR;
    }
    
    @Override
    void dormir(Integer tiempo){
        JOptionPane.showMessageDialog(null, "El pez " + this.nombre + " durmió por " + tiempo.toString() + "h.");
    }
    
    @Override
    void comer(Double cantComida, Integer cantVeces){
        JOptionPane.showMessageDialog(null, "El pez " + this.nombre + " comió " + cantComida.toString() + " lb, por " + cantVeces.toString() + " veces en el día.");
    }
    
    public void movimiento(Double profundidad, Double distancia){
        JOptionPane.showMessageDialog(null, "El pez " + this.nombre + " nadó una distancia de " + distancia.toString() + " m, a una profundidad de " + profundidad.toString() + "m.");
    }
    
    public void saltar(Double altura){
        JOptionPane.showMessageDialog(null, "El pez " + this.nombre + " saltó fuera del agua hasta alcanzar una altura de " + altura.toString() + " m.");
    }
    
    public void emitirSonido(Integer tiempo){
        JOptionPane.showMessageDialog(null, "¿Escuchaste eso? ¡Yo sí!, El pez " + this.nombre + " se comunicó por " + tiempo.toString() + " segundos.");
    }
}
