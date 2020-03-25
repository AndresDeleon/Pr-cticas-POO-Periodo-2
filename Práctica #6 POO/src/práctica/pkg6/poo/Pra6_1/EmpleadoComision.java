/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg6.poo.Pra6_1;

/**
 *
 * @author aeld
 */
public class EmpleadoComision extends Empleado{
    public Double porCom;
    
    public EmpleadoComision(Integer id, Double p, Double pC){
        super(id, p);
        this.porCom = pC;
    }
    
    public void sueldo(){
        this.setPrecio(this.getPrecio() + (this.getPrecio() * this.porCom));
        System.out.println("El sueldo es: $" + this.getPrecio().toString());
    }
}
