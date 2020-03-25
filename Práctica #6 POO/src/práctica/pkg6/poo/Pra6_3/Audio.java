/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg6.poo.Pra6_3;

/**
 *
 * @author aeld
 */
public class Audio extends ArchivoMultimedia{
    public Integer nivelVolumen;
    
    public Audio(String n, Double pKB, Integer nV){
        super(n, pKB);
        this.nivelVolumen = nV;
    }
    
    public void reproducir(){
        System.out.println("El audio del archivo \"" + this.nombre + "\n se está reproduciendo.\nVolumen: " + this.nivelVolumen.toString());
    }
}
