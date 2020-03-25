/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_3;

/**
 *
 * @author aeld
 */
public class Almacen extends Empresa{
    public String[] inventario;
    
    public Almacen(Integer cE, String u, String d, Double i, String[] inv){
        super(cE, u, d, i);
        this.inventario = inv;
    }
    
    public void comprobarinventario(){
        System.out.println("Verificando el inventario del almacen");
    }
    
    public void realizarVenta(){
        System.out.println("Se está realizando una venta");
    }
}
