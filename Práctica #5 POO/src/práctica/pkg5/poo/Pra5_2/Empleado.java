/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_2;
import práctica.pkg5.poo.Pra5_2.Empleado;
import práctica.pkg5.poo.Pra5_2.Gerente;
import práctica.pkg5.poo.Pra5_2.Presidente;
/**
 *
 * @author aeld
 */
public class Empleado {
    public String dui;
    public Double sueldo;
    public Integer horasTrabajo;
    public String area;
    public String nombre;
    public Boolean discapacitado;
    
    public Empleado(String d, Double s,  Integer hT, String a, String n, Boolean dis){
        this.dui = d;
        this.sueldo = s;
        this.horasTrabajo = hT;
        this.area = a;
        this.nombre = n;
        this.discapacitado = dis;
    }
    
    public void entrar(){
        System.out.println("El empleado a entrado");
    }
    
    public void salir(){
        System.out.println("El empleado a salido");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Presidente pre = new Presidente("456312983", 2499.99, 7, "Informática", "Manolo Prieto", false, 10);
        Gerente g1 = new Gerente("953756129", 1199.99, 9, "Informática", "Magdalena Cruz", false, 200.0, 8);
        Gerente g2 = new Gerente("986374346", 999.99, 10, "Informática", "Esteban Melgorio", true, 149.99, 11);
        Empleado emp1 = new Empleado("781678539", 899.99, 8, "Servidores", "Joaquín Melchor", true);
        Empleado emp2 = new Empleado("934837165", 900.0, 8, "Mantenimiento", "Rigoberta Narcizo", false);
        Empleado emp3 = new Empleado("712467656", 1000.0, 9, "Soporte Web", "Facundo Baltonés", false);
    }
}
