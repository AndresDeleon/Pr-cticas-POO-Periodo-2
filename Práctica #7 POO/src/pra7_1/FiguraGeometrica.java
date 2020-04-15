/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra7_1;
import javax.swing.JOptionPane;

/**
 *
 * @author aeld
 */
public class FiguraGeometrica implements Area, Perimetro{
    
    @Override
    public Double area(double base, double altura){
        double area = base * altura;
        return area;
    }
    
    @Override
    public Double perimetro(double base, double altura){
        double perimetro = (base+altura)/2;
        return perimetro;
    }
    
    public static void main(String[] args){
        FiguraGeometrica rectangulo = new FiguraGeometrica();
        double base = Double.parseDouble(JOptionPane.showInputDialog("Medida de la base del rectángulo (cm): "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Medida de la altura del rectángulo (cm): "));
        double area = rectangulo.area(base, altura);
        double perimetro = rectangulo.perimetro(base, altura);
        JOptionPane.showMessageDialog(null, "RECTÁNGULO\n\nEl área del retángulo es: " + area + " cm.\n"
                + "El perímetro del rectángulo es: " +  perimetro + " cm.");
    }
}
