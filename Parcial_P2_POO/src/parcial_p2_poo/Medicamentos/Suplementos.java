/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_p2_poo.Medicamentos;

import javax.swing.JOptionPane;
import parcial_p2_poo.Transacciones.Compra;
import parcial_p2_poo.Transacciones.Venta;

/**
 *
 * @author aeld
 */
public class Suplementos extends Producto{
    public Suplementos(String[] nP, double[] p, int[] e){
        super(nP, p, e);
    }
    
    public void cambExistencias(Compra comp, int op){
        int exisNue = 0;
        do {
            try{
                exisNue = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Existencias a Comprar: "));
            }catch (Exception e){
                exisNue = 0;
                JOptionPane.showMessageDialog(null, "Tiene que ingresar un número válido");
            }
        } while (exisNue == 0);
        comp.sup.existencias[op] += exisNue;
        comp.sup.precioPagar(op, comp, exisNue);
        
    }
    
    public void cambExistencias(Venta vent, int op){
        int exisNue = 0;
        do {
            try{
                exisNue = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Existencias a Comprar: "));
            }catch (Exception e){
                exisNue = 0;
                JOptionPane.showMessageDialog(null, "Tiene que ingresar un número válido");
            }
            if((vent.sup.existencias[op] - exisNue) < 0){
            JOptionPane.showMessageDialog(null, "No hay suficientes existencias de este producto (Disponibles: " + vent.sup.existencias[op] + ")");
            }else{
                vent.sup.existencias[op] -= exisNue;
                vent.sup.precioPagar(op, vent, exisNue);
            }
        } while (exisNue == 0 || (vent.sup.existencias[op] - exisNue) < 0);

    }
    
    public void precioPagar(int op, Compra comp, int cant){
       double total = Math.round(comp.sup.precio[op] * 0.6 * cant * 100);
       total = total/100;
       JOptionPane.showMessageDialog(null, "Cantidad a Pagar: $" + total + "\nCantidad de existencias: " + comp.sup.existencias[op]);
    }
    
    public void precioPagar(int op, Venta vent, int cant){
       double total = Math.round(vent.sup.precio[op] * cant * 100);
       total = total/100;
       JOptionPane.showMessageDialog(null, "FARMACIA \"EL REMEDIO DE LA ABUELITA LALITA\"\n======================================\n"
               + "Cliente: " + vent.nombre
               + "\nDUI: " + vent.dui 
               + "\nProducto Comprado: " + vent.sup.nomProd[op] 
               + "\nPrecio Unidad Producto: $" + vent.sup.precio[op]
               + "\nCantidad de Medicamentos: " + cant
               + "\n======================================"
               + "\nCantidad a Pagar: $" + total);
    }
}
