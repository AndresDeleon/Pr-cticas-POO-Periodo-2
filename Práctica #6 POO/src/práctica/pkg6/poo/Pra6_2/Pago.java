/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg6.poo.Pra6_2;

/**
 *
 * @author aeld
 */
public class Pago {
    public Integer id;
    private Double pago;
    
    public void setPago(Double pago){
        this.pago = pago;
    }
    
    public Double getPago(){
        return pago;
    }
    
    public Pago(Integer id, Double p){
        this.id = id;
        this.pago = p;
    }
    
    public void pagar(){
        System.out.println("Cantidad a pagar: $" + this.pago);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pago[] pago = new Pago[2];
        pago[0] = new PagoAlContado(1494, 499.99);
        pago[1] = new PagoConTarjetaCredito(495, 999.99);
        for (int i = 0; i < pago.length; i++) {
            pago[i].pagar();
        }
    }
}
