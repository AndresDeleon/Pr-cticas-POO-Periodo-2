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
public interface ListProd {
    public Suplementos sup = new Suplementos(new String[]{"PediaSure", "CitroBionic", "Naturelo", "Centrum Specialist Energy"},
            new double[]{34.69, 24.99, 24.95, 19.99}, new int[]{30, 30, 30, 30});
    public AntiInflamatorios anti = new AntiInflamatorios(new String[]{"Ibuprofeno", "Naproxeno", "PHLOGENZYM", "NEXIUM I.V."},
            new double[]{2.49, 5.25, 10.20, 32.49}, new int[]{30, 30, 30, 30});
    public Analgésicos an = new Analgésicos(new String[]{"Decosil", "Dolprofen", "Tramadol", "Paracetamol"},
            new double[]{1.73, 0.99, 6.75, 2.72}, new int[]{30, 30, 30, 30});
    public Inmunosupresores inmu = new Inmunosupresores(new String[]{"Celprot", "Equoral", "SETATREP", "Imuran"},
            new double[]{94.49, 0.25, 10.99, 40.49}, new int[]{30, 30, 30, 30});
}
