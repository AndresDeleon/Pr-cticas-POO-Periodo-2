/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_2;

/**
 *
 * @author aeld
 */
public class Gerente extends Empleado{
    public Double bono;
    public Integer nivelEdificio;
    
    public Gerente(String d, Double s,  Integer hT, String a, String n, Boolean dis, Double b, Integer nE){
        super(d, s, hT, a, n, dis);
        this.bono = b;
        this.nivelEdificio = nE;
    }
    
    public void supervisarEmpleados(){
        System.out.println("El gerente está supervisando a los empleados");
    }
    
    public void administrarEfectivo(){
        System.out.println("El gerente está gestionando el dinero de la empresa");
    }
}
