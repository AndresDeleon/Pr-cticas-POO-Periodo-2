/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_p2_poo;
import parcial_p2_poo.Transacciones.ListProd;
import parcial_p2_poo.Transacciones.Compra;
import parcial_p2_poo.Transacciones.Venta;
import javax.swing.JOptionPane;
/**
 *
 * @author aeld
 */
public class Parcial_P2_POO  implements ListProd{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Compra comp = new Compra(sup, anti, an, inmu);
        Venta vent = new Venta(sup, anti, an, inmu);
        int escFarm = 0;
        do {
            try{
                escFarm = Integer.parseInt(JOptionPane.showInputDialog("FARMACIA \"EL REMEDIO DE LA ABUELITA LALITA\"\n======================================"
                + "\nSeleccione la opción a realizar:\n"
                + "[1] Comprar Productos\n"
                + "[2] Venta de Productos\n"
                + "[3] Salir")); 
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Tiene que ingresar un número válido");
            }
            swAccion(escFarm , comp, vent);
        } while (escFarm >= 4 && escFarm <= 0 || escFarm != 3);  
        
        
    }
    
    public static void swAccion(Integer op, Compra comp, Venta vent){
        switch(op){
            case 1:
                int escTipMedC = 0;
                do {
                    try{
                        escTipMedC = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de medicamento que desea comprar:\n\n"
                        + "[1] Suplementos\n"
                        + "[2] Anti inflamatorios\n"
                        + "[3] Analgésicos\n"
                        + "[4] Inmunosupresores"));
                    } catch(Exception e){
                        escTipMedC = 0;
                        JOptionPane.showMessageDialog(null, "Tiene que ingresar un número válido");
                    }
                } while (escTipMedC < 1 && escTipMedC > 4 || escTipMedC == 0); 
                comp.escTipMed(escTipMedC, comp, vent);
                vent.sup.existencias = comp.sup.existencias;
                vent.anti.existencias = comp.anti.existencias;
                vent.an.existencias = comp.an.existencias;
                vent.inmu.existencias = comp.inmu.existencias;
                break;
            case 2:
                int escTipMedV = 0;
                vent.nombre = JOptionPane.showInputDialog("Nombre del Cliente: ");
                vent.dui= JOptionPane.showInputDialog("DUI del Cliente: ");
                do {
                    try{
                        escTipMedV = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de medicamento a vender:\n\n"
                        + "[1] Suplementos\n"
                        + "[2] Anti inflamatorios\n"
                        + "[3] Analgésicos\n"
                        + "[4] Inmunosupresores"));
                    } catch(Exception e){
                        escTipMedV = 0;
                        JOptionPane.showMessageDialog(null, "Tiene que ingresar un número válido");
                    }
                } while (escTipMedV < 1 && escTipMedV > 4 || escTipMedV == 0); 
                vent.escTipMed(escTipMedV, comp, vent);
                comp.sup.existencias = vent.sup.existencias;
                comp.anti.existencias = vent.anti.existencias;
                comp.an.existencias = vent.an.existencias;
                comp.inmu.existencias = vent.inmu.existencias;
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El Programa se cerrará, vuelva pronto");
                break;
        }
    }
}
