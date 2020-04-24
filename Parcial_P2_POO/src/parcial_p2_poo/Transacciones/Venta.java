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
public class Venta extends SelecMed{
    public Suplementos sup;
    public AntiInflamatorios anti;
    public Analgésicos an;
    public Inmunosupresores inmu;
    
    public Venta(Suplementos s, AntiInflamatorios aI, Analgésicos a, Inmunosupresores i){
        this.sup = s;
        this.anti = aI;
        this.an = a;
        this.inmu = i;
    }
    
    @Override
    public void escTipMed(Integer op, Compra comp, Venta vent){
        int numProd = 0;
        switch(op){
            case 1:
                numProd = vent.sup.escProd(vent.sup.nomProd);
                vent.sup.cambExistencias(vent, numProd);
                break;
            case 2:
                numProd = vent.anti.escProd(vent.anti.nomProd);
                vent.anti.cambExistencias(vent, numProd);
                break;
            case 3:
                numProd = vent.an.escProd(vent.an.nomProd);
                vent.an.cambExistencias(vent, numProd);
                break;
            case 4:
                numProd = vent.inmu.escProd(vent.inmu.nomProd);
                vent.inmu.cambExistencias(vent, numProd);
                break;
        }
    }
}
