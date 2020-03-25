/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_1;
/**
 *
 * @author aeld
 */
public class Guitarra extends InstrumentoMusical {
    public String tipoCuerdas;
    
    public Guitarra(Double p, Integer a, String t, String m, String tC){
        super(p, a, t, m);
//        this.AñosUso = 3;
//        this.modelo = "Maveric Rock";
//        this.precio = 299.99;
//        this.tipoInst = "Eléctrico";
        this.tipoCuerdas = tC;
    }
    
    public void afinarGuitarra(){
        System.out.println("La guitarra se está afinando");
    }
}
