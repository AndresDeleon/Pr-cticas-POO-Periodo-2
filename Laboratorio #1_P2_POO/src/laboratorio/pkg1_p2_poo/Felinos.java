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
public class Felinos extends Mascota {
    public Integer vidasFelinas;
    public Boolean pelo;
    public String formaOrejas;
            
    public Felinos(String n, String e, Integer vF, Boolean pelo, String fO){
        super(n, e);
        this.vidasFelinas = vF;
        this.pelo = pelo;
        this.formaOrejas = fO;
    }
            
    @Override
    void dormir(Integer tiempo){
        JOptionPane.showMessageDialog(null, "El felino " + this.nombre + " durmió por " + tiempo.toString() + "h.");
    }
    
    @Override
    void comer(Double cantComida, Integer cantVeces){
        JOptionPane.showMessageDialog(null, "El felino " + this.nombre + " comió " + cantComida.toString() + " lb, por " + cantVeces.toString() + " veces en el día.");
    }
    
    public void emitirSonido(Integer tiempo){
        JOptionPane.showMessageDialog(null, "El felino " + this.nombre + " maulló por " + tiempo.toString() + " segundos.");
    }
    
    public void movimiento(Double altura){
        JOptionPane.showMessageDialog(null, "¡Oh no! El gato " + this.nombre + " se cayó. Uff... ¡Qué alivio! Cayó de pie de una altura de " + altura.toString() + " m.");
    }
    
    public void masaje(){
        JOptionPane.showMessageDialog(null, "¡Qué suerte! El gato " + this.nombre + " te está dando un masaje, disfrutalo.");
    }
}
