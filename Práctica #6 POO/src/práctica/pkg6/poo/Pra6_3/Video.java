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
public class Video extends ArchivoMultimedia{
    public String calidadVideoP;
    
    public Video(String n, Double pKB, String cVP){
        super(n, pKB);
        this.calidadVideoP = cVP;
    }
    
    public void reproducir(){
        System.out.println("El video del archivo \"" + this.nombre + "\n se está reproduciendo.\nCalidad: " + this.calidadVideoP.toString() + "p");
    }
}
