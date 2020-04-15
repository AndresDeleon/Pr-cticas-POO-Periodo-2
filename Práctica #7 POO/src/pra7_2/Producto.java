/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra7_2;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author aeld
 */
public class Producto implements Impuesto, Caducidad {
    public Integer id;
    public double precio;
    public String fechaCad;
    
    @Override
    public Double calcImp(double precio){
        double total = precio + (precio * iva);
        return total;
    }
    
    @Override
    public void caducidad(String fecha){
        JOptionPane.showMessageDialog(null, "¡El producto caducará el " + fecha + ", recuérdelo!");
    }
    
    public static void main(String[] args){
        Producto producto = new Producto();
        producto.id = Integer.parseInt(JOptionPane.showInputDialog("ID del Producto: "));
        producto.precio= Double.parseDouble(JOptionPane.showInputDialog("Precio del Producto: "));
        producto.fechaCad = JOptionPane.showInputDialog("Fecha de Caducidad (dd/mm/yyyy): ");
        double totalPagar = producto.calcImp(producto.precio);
        JOptionPane.showMessageDialog(null, "ID del Producto: " + producto.id + "\nCantidad a Pagar: $" + totalPagar);
        producto.caducidad(producto.fechaCad);
    }
}
