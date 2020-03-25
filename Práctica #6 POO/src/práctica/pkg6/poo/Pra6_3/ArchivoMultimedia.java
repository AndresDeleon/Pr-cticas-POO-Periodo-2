/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg6.poo.Pra6_3;
import práctica.pkg6.poo.Pra6_3.Audio;
import práctica.pkg6.poo.Pra6_3.Video;

/**
 *
 * @author aeld
 */
public class ArchivoMultimedia {
    public String nombre;
    public Double pesoKB;
    
    public ArchivoMultimedia(String n, Double pKB){
        this.nombre = n;
        this.pesoKB = pKB;
    }
    
    public void reproducir(){
        System.out.println("El archivo \"" + this.nombre + "\" se está reproduciendo...");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArchivoMultimedia[] multimedia = new ArchivoMultimedia[3];
        multimedia[0] = new ArchivoMultimedia("Colores Adinerados - Tania Mendico | Video Clip", 24.6);
        multimedia[1] = new Audio("5 TIPS para Mejorar en tus Estudios | EstebanTEnseña", 24.6, 51);
        multimedia[2] = new Video("Receta de Lasaña con Hongos en 5 Pasos | El Rincón de la Abuela", 24.6, "720");
        for (int i = 0; i < multimedia.length; i++) {
            multimedia[i].reproducir();
        }
    }
}
