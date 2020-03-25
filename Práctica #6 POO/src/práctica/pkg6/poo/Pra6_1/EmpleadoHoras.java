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
public class EmpleadoHoras extends Empleado{
    public Integer horas;
    public Double precioH;
    
    public EmpleadoHoras(Integer id, Double p, Integer h, Double pH){
        super(id, p);
        this.horas = h;
        this.precioH = pH;
    }
    
    public void sueldo(){
        this.setPrecio(this.precioH * this.horas);
        System.out.println("El sueldo es: $" + this.getPrecio().toString());
    }
}
