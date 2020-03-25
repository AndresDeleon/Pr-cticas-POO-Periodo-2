/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import práctica.pkg5.poo.Pra5_4.Proveedor;
/**
 *
 * @author aeld
 */
public class Muebles extends Producto{
    
    public Muebles(Integer id, Double precio){
        super(id, precio);
    }
    
    public Proveedor ingProductos(Integer cant){
        ArrayList<Muebles> lMue = new ArrayList<Muebles>();
        Double total = 0.0;
        for (int i = 0; i < cant; i++) {
            Integer id = Integer.parseInt(JOptionPane.showInputDialog("ID del Producto:"));
            Double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto:"));
            total = total + precio;
            lMue.add(new Muebles(id, precio));
        }
        Proveedor pro = new Proveedor();
        pro.lMue = lMue;
        pro.totalMue = total;
        return pro;
    }
}
