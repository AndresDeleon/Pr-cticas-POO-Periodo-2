/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg6.poo.Pra6_1;
import práctica.pkg6.poo.Pra6_1.EmpleadoAsalariado;
import práctica.pkg6.poo.Pra6_1.EmpleadoComision;
import práctica.pkg6.poo.Pra6_1.EmpleadoHoras;
/**
 *
 * @author aeld
 */
public class Empleado {
    public Integer id;
    private Double sueldo;
    
    public void setPrecio(Double precio){
        this.sueldo = precio;
    }
    
    public Double getPrecio(){
        return this.sueldo;
    }
    
    public Empleado(Integer id, Double p){
        this.id = id;
        this.sueldo = p;
    }
    
    public void sueldo(){
        System.out.println("El sueldo es: $" + this.sueldo);
    }
    
    public static void main(String[] args){
        Empleado[] empleado = new Empleado[3];
        empleado[0] = new EmpleadoAsalariado(144, 899.99);
        empleado[1] = new EmpleadoHoras(365, 0.0, 7, 133.99);
        empleado[2] = new EmpleadoComision(752, 1000.0, 0.15);
        for (int i = 0; i < empleado.length; i++) {
            empleado[i].sueldo();
        }
    }
}
