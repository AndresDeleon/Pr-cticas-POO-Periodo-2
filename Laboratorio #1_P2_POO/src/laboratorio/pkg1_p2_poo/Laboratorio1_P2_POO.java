/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg1_p2_poo;
import javax.swing.JOptionPane;
import laboratorio.pkg1_p2_poo.Caninos;
import laboratorio.pkg1_p2_poo.Aves;
/**
 *
 * @author aeld
 */
public class Laboratorio1_P2_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer op = 0;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("¿Qué clase desea ver?\n"
                + "\n[1] Caninos"
                + "\n[2] Felinos"
                + "\n[3] Peces"
                + "\n[4] Aves"
                + "\n[5] Roedores"
                + "\n[6] Salir"));
            switch(op){
            case 1:
                //Prueba Clase "Caninos"
                Caninos can = new Caninos("Bolt", "Golden Retriever", "Dorado", false, false);
                JOptionPane.showMessageDialog(null, "Datos del Canino:\n\n"
                + "Nombre: " + can.nombre + "\nEspecie: " + can.especie
                + "\nColor de Pelaje: " + can.colorPelaje + "\nCola Cortada: " + can.colaCortada.toString()
                + "\nOrejas Puntadas: " + can.orejasPuntadas.toString());
                can.comer(2.1, 3);
                can.dormir(3);
                can.cavar(50);
                can.emitirSonido(15);
                can.movimiento(7.3, 40);
                break;
            case 2:
                //Prueba Clase "Felinos"
                Felinos gato = new Felinos("Sr. Calvo", "Esfinge", 7, false, "Redondeadas");
                JOptionPane.showMessageDialog(null, "Datos del Felino:\n\n"
                + "Nombre: " + gato.nombre + "\nEspecie: " + gato.especie
                + "\nVidas Felinas: " + gato.vidasFelinas + "\nPelo: " + gato.pelo.toString()
                + "\nOrejas Puntadas: " + gato.formaOrejas);
                gato.comer(1.5, 5);
                gato.dormir(2);
                gato.masaje();
                gato.emitirSonido(15);
                gato.movimiento(7.3);
                break;
            case 3:
                //Prueba Clase "Peces"
                Peces pez = new Peces("Fishy", "Pez Payaso", false, true, "Bránqueas");
                JOptionPane.showMessageDialog(null, "Datos del Pez:\n\n"
                + "Nombre: " + pez.nombre + "\nEspecie: " + pez.especie
                + "\nCambio de Color: " + pez.cambiaColor.toString() + "\nHermafrodíta: " + pez.hermafrodita
                + "\nForma de Rspirar: " + pez.formaRespirar.toString());
                pez.comer(0.3, 6);
                pez.dormir(2);
                pez.saltar(2.4);
                pez.movimiento(5.9, 7.0);
                pez.emitirSonido(12);
                break;
            case 4:
                //Prueba Clase "Aves"
                Aves perico = new Aves("Pepito", "Loro Cariamarillo", true, "Gancho", "Planear");
                JOptionPane.showMessageDialog(null, "Datos del Ave:\n\n"
                + "Nombre: " + perico.nombre + "\nEspecie: " + perico.especie
                + "\nAlas Cortadas: " + perico.alasCortadas.toString() + "\nForma del Pico: " + perico.formaPico
                + "\nForma de Volar: " + perico.formaVolar);
                perico.comer(0.4, 4);
                perico.dormir(5);
                perico.limpiarPlumas();
                perico.movimiento(2.4, 5.6);
                perico.emitirSonido(48);
                break;
            case 5:
                //Prueba Clase "Roedores"
                Roedores raton = new Roedores("Jerry", "Ratón Casero", true, "Bolita", "Café");
                JOptionPane.showMessageDialog(null, "Datos del Roedor:\n\n"
                + "Nombre: " + raton.nombre + "\nEspecie: " + raton.especie
                + "\nCola: " + raton.cola.toString() + "\nForma: " + raton.forma
                + "\nColor: " + raton.color);
                raton.comer(0.4, 4);
                raton.dormir(5);
                raton.jugarLaberinto();
                raton.movimiento(3);
                raton.emitirSonido(7);
                break;
            }   
        } while(op != 6);
    } 
}
