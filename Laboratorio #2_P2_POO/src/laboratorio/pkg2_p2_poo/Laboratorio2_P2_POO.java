/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg2_p2_poo;
import javax.swing.JOptionPane;
import static laboratorio.pkg2_p2_poo.EdificioEducativo.cantSalones;
import static laboratorio.pkg2_p2_poo.EdificioEducativo.libreria;
import static laboratorio.pkg2_p2_poo.EdificioPolideportivo.canchBask;
import static laboratorio.pkg2_p2_poo.EdificioPolideportivo.canchFut;
import static laboratorio.pkg2_p2_poo.EdificioPolideportivo.piscina;
/**
 *
 * @author aeld
 */
public class Laboratorio2_P2_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op = 0;
        do {
            Edificio edifPrueba = new Edificio(4, true, 11, "General", 122000.0, 3, 500.0);
            op = Integer.parseInt(JOptionPane.showInputDialog("PRUEBA DE CLASES DE EDIFICIOS\n\n"
                    + "Escoja la opción que desea realizar:\n"
                    + "[1] Prueba Edificio Hospitalario\n"
                    + "[2] Prueba Edificio Polideportivo\n"
                    + "[3] Prueba Edificio Educativo\n"
                    + "[4] Salir"));
            switch(op){
                case 1:
                    JOptionPane.showMessageDialog(null, "EDIFICIO HOSPITALARIO\n\n"
                            + "Tipo de Hospital: " + edifPrueba.tipoHospital 
                            + "\nÁrea del Terreno: " + edifPrueba.areaTerreno + " m2" + "\nCantidad de Pisos: " + edifPrueba.cantPisos
                            + "\nCantidad Cuartos Cirugía: " + edifPrueba.cuartCiruj + "\nUnidad de Cuidados Intensivos: " + edifPrueba.uCI
                            + "\nCantidad Salas Operaciones: " + edifPrueba.salOpe + "\nCosto: $" + edifPrueba.costo);
                    break;
                case 2:
                    edifPrueba.costo = 77000.0;
                    edifPrueba.areaTerreno = 1000.0;
                    edifPrueba.cantPisos = 2;
                    JOptionPane.showMessageDialog(null, "EDIFICIO POLIDEPORTIVO\n\n"
                            + "Área del Terreno: " + edifPrueba.areaTerreno + " m2"
                            + "\nCantidad de Pisos: " + edifPrueba.cantPisos + "\nPiscina: " + piscina
                            + "\nCanchas de Basketball: " + canchBask + "\nCanchas Fútbol: " + canchFut
                            + "\nCosto: $" + edifPrueba.costo);
                    break;
                case 3:
                    edifPrueba.costo = 150000.0;
                    edifPrueba.areaTerreno = 777.7;
                    edifPrueba.cantPisos = 2;
                    JOptionPane.showMessageDialog(null, "EDIFICIO EDUCATIVO\n\n"
                            + "Área del Terreno: " + edifPrueba.areaTerreno + " m2"
                            + "\nCantidad de Pisos: " + edifPrueba.cantPisos + "\nCantidad Salones: " + cantSalones
                            + "\nLibreria: " + libreria + "\nCosto: $" + edifPrueba.costo);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "¡Vuelva Pronto!");
                    break;
            }
        } while (op != 4);
        
    }
    
}
