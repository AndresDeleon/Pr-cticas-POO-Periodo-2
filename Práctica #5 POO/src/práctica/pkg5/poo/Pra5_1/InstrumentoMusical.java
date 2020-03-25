/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_1;
import práctica.pkg5.poo.Pra5_1.Guitarra;
import práctica.pkg5.poo.Pra5_1.Piano;
import práctica.pkg5.poo.Pra5_1.Trompeta;
/**
 *
 * @author aeld
 */
public class InstrumentoMusical {
    public Double precio;
    public Integer AñosUso;
    public String tipoInst;
    public String modelo;
    
    public InstrumentoMusical(Double p, Integer a, String t, String m){
        this.precio = p;
        this.AñosUso = a;
        this.tipoInst = t;
        this.modelo = m;
    }
    
    public void conectarInst(){
        System.out.println("El Instrumento está conectado");
    }
    
    public void desconectarInts(){
        System.out.println("El Instrumento está desconectado");
    }
    
    public void tocarInst(){
        System.out.println("El Instrumento está siendo tocado");
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
        Guitarra gui = new Guitarra(299.99, 3, "Eléctrica", "Maverick Rock", "Nylon");
        Piano pia = new Piano(499.99, 8, "Clásico", "Handy Music", 72);
        Trompeta tro = new Trompeta(149.99, 0, "Normal", "Tromp Wallston", 7.5);
        System.out.println("GUITARRA\nPrecio: $" + gui.precio + "\nAños Utilizados: " + gui.AñosUso.toString()
                + "\nTipo: " + gui.tipoInst + "\nModelo: " + gui.modelo + "\nTipo Cuerdas: " + gui.tipoCuerdas);
        System.out.println("PIANO\nPrecio: $" + pia.precio + "\nAños Utilizados: " + pia.AñosUso.toString()
                + "\nTipo: " + pia.tipoInst + "\nModelo: " + pia.modelo + "\nCantidad Teclas: " + pia.cantTeclas.toString());
        System.out.println("TROMPETA\nPrecio: $" + tro.precio + "\nAños Utilizados: " + tro.AñosUso.toString()
                + "\nTipo: " + tro.tipoInst + "\nModelo: " + tro.modelo + "\nTamaño: " + tro.tamaño.toString());
    }
}


