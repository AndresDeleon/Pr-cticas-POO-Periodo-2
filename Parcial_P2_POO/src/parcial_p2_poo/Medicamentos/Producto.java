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
public class Producto {
    public double[] precio;
    public String[] nomProd;
    public int[] existencias;
    
    public Producto(String[] nP, double[] p, int[] e){
        this.nomProd = nP;
        this.precio = p;
        this.existencias = e;
    }
    public Integer escProd(String[] listProd){
        String cadProd = "";
        for (int i = 0; i < listProd.length; i++) {
            cadProd += "[" + (i + 1) + "] " + listProd[i] + "\n";
        }
       int escProd = 0;
        do {
            try{
                escProd = Integer.parseInt(JOptionPane.showInputDialog("Escoja el Producto que desea comprar: \n\n" + cadProd));
            } catch (Exception e){
                escProd = -1;
                JOptionPane.showMessageDialog(null, "Tiene que ingresar un número válido");
            } 
        } while (escProd > listProd.length && escProd < 1 || escProd == -1);
        return (escProd - 1);
    }
    
    public void cambExistencias(Compra comp){
        int exisNue = 0;
        do {
            try{
                exisNue = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Existencias a Comprar: "));
            }catch (Exception e){
                exisNue = 0;
                JOptionPane.showMessageDialog(null, "Tiene que ingresar un número válido");
            }
        } while (exisNue == 0);
    }
    
    public void cambExistencias(Venta vent){
        int exisNue = 0;
        do {
            try{
                exisNue = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Existencias a Comprar: "));
            }catch (Exception e){
                exisNue = 0;
                JOptionPane.showMessageDialog(null, "Tiene que ingresar un número válido");
            }
        } while (exisNue == 0);
    }

}
