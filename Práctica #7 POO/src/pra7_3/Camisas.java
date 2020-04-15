/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra7_3;
import javax.swing.JOptionPane;
/**
 *
 * @author aeld
 */
public class Camisas 
        extends PrendaVestir 
        implements Tela, EstiloCamisa {
    
    public String talla;
    public String tela;
    public String estiloCamisa;
    
    @Override
    public String talla(){
        String t = JOptionPane.showInputDialog("Talla deseada: ");
        return t;
    }
    
    @Override
    public String tela(){
        String t = JOptionPane.showInputDialog("Tela de la Camisa: ");
        return t;
    }
    
    @Override
    public String estiloCam(){
        String eC = JOptionPane.showInputDialog("Estilo de la Camisa: ");
        return eC;
    }
    
    public static void main(String[] args){
        Camisas camisa = new Camisas();
        camisa.id = Integer.parseInt(JOptionPane.showInputDialog("ID de la Prenda: "));
        camisa.precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de la Prenda: "));
        camisa.talla = camisa.talla();
        camisa.tela= camisa.tela();
        camisa.estiloCamisa = camisa.estiloCam();
        JOptionPane.showMessageDialog(null, "Tienda \"La Ropita de Doña Cruz\"\n\n"
                + "ID de la Prenda: " + camisa.id + "\nCantidad a Pagar: $" + camisa.precio +"\nTalla: " + camisa.talla
                + "\nTipo de Tela: " + camisa.tela + "\nEstilo de la Camisa: " + camisa.estiloCamisa);
    }
}
