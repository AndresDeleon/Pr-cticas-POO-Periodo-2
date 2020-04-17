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
public class EdificioHospitalario{
    public Integer cuartCiruj;
    public Boolean uCI;
    public Integer salOpe;
    public String tipoHospital;
    
    public EdificioHospitalario(Integer cC, Boolean uCI, Integer sO, String tH){
        this.cuartCiruj = cC;
        this.uCI = uCI;
        this.salOpe = sO;
        this.tipoHospital = tH;
    }
    
    public void colocarMuebles(){
        JOptionPane.showMessageDialog(null, "Se están colocando los muebles de las salas del hospital");
    }
    
    public void instAC(){
        JOptionPane.showMessageDialog(null, "Se están instalando el aire acondicionado de las salas del hospital");
    }
}
