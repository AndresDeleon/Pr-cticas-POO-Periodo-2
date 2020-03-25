/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aeld
 */
public class Entretenimiento extends Producto{
    
    public Entretenimiento(Integer id, Double precio){
        super(id, precio);
    }
    
    public Proveedor ingProductos(Integer cant){
        ArrayList<Entretenimiento> lEnt = new ArrayList<Entretenimiento>();
        Double total = 0.0;
        for (int i = 0; i < cant; i++) {
            Integer id = Integer.parseInt(JOptionPane.showInputDialog("ID del Producto:"));
            Double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto:"));
            total = total + precio;
            lEnt.add(new Entretenimiento(id, precio));
        }
        Proveedor pro = new Proveedor();
        pro.lEnt = lEnt;
        pro.totalEnt = total;
        return pro;
    }
}
