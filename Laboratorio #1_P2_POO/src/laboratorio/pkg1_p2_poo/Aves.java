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
public class Aves extends Mascota{
    public Boolean alasCortadas;
    public String formaPico;
    public String formaVolar;
    
    public Aves(String n, String e, Boolean aC, String fP, String fV){
        super(n, e);
        this.alasCortadas = aC;
        this.formaPico = fP;
        this.formaVolar = fV;
    }
    
    @Override
    void dormir(Integer tiempo){
        JOptionPane.showMessageDialog(null, "El ave " + this.nombre + " durmió por " + tiempo.toString() + "h.");
    }
    
    @Override
    void comer(Double cantComida, Integer  cantVeces){
        JOptionPane.showMessageDialog(null, "El ave " + this.nombre + " comió " + cantComida.toString() + " lb, por " + cantVeces.toString() + " veces en el día.");
    }
    
    void movimiento(Double velocidad, Double altura){
        JOptionPane.showMessageDialog(null, "El ave " + this.nombre + " voló a una velocidad de " + velocidad.toString() + " m/s, en una altura de " + altura.toString() + " m.");
    }
    
    void limpiarPlumas(){
        JOptionPane.showMessageDialog(null, "El ave " + this.nombre + " se limpió las plumas.");
    }
    
    void emitirSonido(Integer tiempo){
        JOptionPane.showMessageDialog(null, "El ave " + this.nombre + " graznó por " + tiempo.toString() + " segundos. ¡Qué molestía!");
    }
}
