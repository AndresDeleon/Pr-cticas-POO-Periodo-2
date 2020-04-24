/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_p2_poo.Transacciones;

import parcial_p2_poo.Medicamentos.Suplementos;
import parcial_p2_poo.Medicamentos.Analgésicos;
import parcial_p2_poo.Medicamentos.Inmunosupresores;
import parcial_p2_poo.Medicamentos.AntiInflamatorios;

/**
 *
 * @author aeld
 */
public class Compra extends SelecMed{
    public String nomProd;
    public Suplementos sup;
    public AntiInflamatorios anti;
    public Analgésicos an;
    public Inmunosupresores inmu;
    
    public Compra(Suplementos s, AntiInflamatorios aI, Analgésicos a, Inmunosupresores i){
        this.sup = s;
        this.anti = aI;
        this.an = a;
        this.inmu = i;
    }
    
    @Override
    public void escTipMed(Integer op, Compra comp, Venta vent){
        Integer numProd = 0;
        switch(op){
            case 1:
                numProd = comp.sup.escProd(comp.sup.nomProd);
                comp.sup.cambExistencias(comp, numProd);
                break;
            case 2:
                numProd = comp.anti.escProd(comp.anti.nomProd);
                comp.anti.cambExistencias(comp, numProd);
                break;
            case 3:
                numProd = comp.an.escProd(comp.an.nomProd);
                comp.an.cambExistencias(comp, numProd);
                break;
            case 4:
                numProd = comp.inmu.escProd(comp.inmu.nomProd);
                comp.inmu.cambExistencias(comp, numProd);
                break;
        }
    }
    

}
