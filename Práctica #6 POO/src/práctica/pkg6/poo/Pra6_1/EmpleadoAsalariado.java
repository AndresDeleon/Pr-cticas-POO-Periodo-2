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
public class EmpleadoAsalariado extends Empleado{
    public EmpleadoAsalariado(Integer id, Double p){
        super(id, p);
    }
    
    public void sueldo(){
        System.out.println("El sueldo es: $" + this.getPrecio().toString());
    }
}
