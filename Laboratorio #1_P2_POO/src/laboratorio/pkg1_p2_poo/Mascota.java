/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg1_p2_poo;

/**
 *
 * @author aeld
 */
public abstract class Mascota {
    public String nombre;
    public String especie;
    
    public Mascota(String n, String e){
        this.nombre = n;
        this.especie = e;
    }
    
    abstract void dormir(Integer tiempo);
    abstract void comer(Double cantComida, Integer cantVeces);
}
