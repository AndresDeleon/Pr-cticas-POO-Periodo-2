/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_4;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import práctica.pkg5.poo.Pra5_4.Electrodomesticos;
import práctica.pkg5.poo.Pra5_4.Entretenimiento;
import práctica.pkg5.poo.Pra5_4.Muebles;
/**
 *
 * @author aeld
 */
public class Proveedor {
    public ArrayList<Electrodomesticos> lEle = new ArrayList<Electrodomesticos>();
    public Double totalEle;
    public ArrayList<Entretenimiento> lEnt = new ArrayList<Entretenimiento>();
    public Double totalEnt;
    public ArrayList<Muebles> lMue = new ArrayList<Muebles>();
    public Double totalMue;
    
    public Proveedor(){
        
    }
    
    public Proveedor(ArrayList<Electrodomesticos> lEle, ArrayList<Entretenimiento> lEnt, ArrayList<Muebles> lMue, Double totalEle, Double totalEnt, Double totalMue){
        this.lEle = lEle;
        this.totalEle = totalEle;
        this.lEnt = lEnt;
        this.totalEnt = totalEnt;
        this.lMue = lMue;
        this.totalMue = totalMue;
    }
    
    public Integer tipoProducto(){
        Integer op = Integer.parseInt(JOptionPane.showInputDialog("LISTA PEDIDOS PARA PROVEEDOR\n"
                + "Ingrese la opción del tipo de producto a pedir:\n"
                + "[1] Electrodomésticos\n"
                + "[2] Entretenimiento\n"
                + "[3] Muebles\n"
                + "[4] Salir"));
        return op;
    }
    
    public Integer cantProductos(){
        Integer cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos a pedir: "));
        return cant;
    }
     
    public Proveedor switchProducto(Integer op, Integer cant, Electrodomesticos ele, Entretenimiento ent, Muebles mue, Proveedor pro){
        switch(op){
            case 1:
                pro = ele.ingProductos(cant);
                break;
            case 2:
                pro = ent.ingProductos(cant);
                break;
            case 3:
                pro = mue.ingProductos(cant);
                break;
        }
        return pro;
    }
    
    public void mostraLista(Proveedor pro){
        String cadLEle = "";
        String cadLEnt = "";
        String cadLMue = "";

        if (pro.lEle.isEmpty() == false){
            for (int i = 0; i < pro.lEle.size(); i++) {
             cadLEle = cadLEle + "\n\nID Producto: " + pro.lEle.get(i).id.toString() + "\nPrecio: $" + pro.lEle.get(i).precio;
            }
        }else{
            cadLEle = "NO DATA";
            pro.totalEle = 0.0;
        }
        
        
        if (pro.lEnt.isEmpty() == false){
            for (int i = 0; i < pro.lEnt.size(); i++) {
            cadLEnt = cadLEnt+ "\n\nID Producto: " + pro.lEnt.get(i).id.toString() + "\nPrecio: $" + pro.lEnt.get(i).precio;
            }
        }else{
            cadLEnt = "NO DATA";
            pro.totalEnt = 0.0;
        }
        
        
        if (pro.lMue.isEmpty() == false){
            for (int i = 0; i < pro.lMue.size(); i++) {
            cadLMue = cadLMue + "\n\nID Producto: " + pro.lMue.get(i).id.toString() + "\nPrecio: $" + pro.lMue.get(i).precio;
            }
        }
        else{
            cadLMue = "NO DATA";
            pro.totalMue = 0.0;
        }
        
        JOptionPane.showMessageDialog(null, "LISTADO DE PRODUCTOS\n\nELECTRODOMÉSTICOS:"
        + cadLEle + "\n[TOTAL]: $" + pro.totalEle.toString() + 
                "\n\nENTRETENIMIENTO:" + cadLEnt + "\n[TOTAL]: $" + pro.totalEnt.toString() +
                "\n\nMUEBLES:" + cadLMue +"\n[TOTAL]: $" + pro.totalMue.toString());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Proveedor proveedor = new Proveedor();
        Integer op = 0;
        Integer cant = 0;
        Electrodomesticos ele = new Electrodomesticos(0,0.0);
        Entretenimiento ent = new Entretenimiento(0,0.0);
        Muebles mue = new Muebles(0,0.0);
        do{
            op = proveedor.tipoProducto();
            if (op != 4){
            cant = proveedor.cantProductos();
            proveedor = proveedor.switchProducto(op, cant, ele, ent, mue, proveedor);
            proveedor.mostraLista(proveedor);
            }
        }while(op != 4);
    }
}
