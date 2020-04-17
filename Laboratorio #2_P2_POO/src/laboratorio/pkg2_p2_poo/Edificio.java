/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg2_p2_poo;

import javax.swing.JOptionPane;

/**
 *
 * @author aeld
 */
public class Edificio 
        extends EdificioHospitalario 
        implements EdificioPolideportivo, EdificioEducativo{
    
    public double costo;
    public int cantPisos;
    public double areaTerreno;
    
    public Edificio(Integer cC, Boolean uCI, Integer sO, String tH, Double c, Integer cP, Double aT){
        super(cC, uCI, sO, tH);
        this.costo = c;
        this.cantPisos = cP;
        this.areaTerreno = aT;
    }
    
    //Polideportivo
    @Override
    public void cespedCancha(){
        JOptionPane.showMessageDialog(null, "Se está plantado el césped de la cancha");
    }
    
    @Override
    public void limpiarPiscina(){
        JOptionPane.showMessageDialog(null, "La piscina fue vaciada y limpiada por manos expertas");
    }
    
    //Educativo
    @Override
    public void instProyector(){
        JOptionPane.showMessageDialog(null, "Los proyectores están siendo instalados en cada uno de los salones de clase");
    }
    
    @Override
    public void ubicarEscritorios(){
        JOptionPane.showMessageDialog(null, "Los escritorios de los docentes se están instalando en cada uno de los salones");
    }
}
