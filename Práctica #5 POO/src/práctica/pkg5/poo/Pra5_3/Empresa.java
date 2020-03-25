/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5.poo.Pra5_3;
import java.util.Scanner;
import práctica.pkg5.poo.Pra5_3.Informática;
import práctica.pkg5.poo.Pra5_3.Bancaria;
import práctica.pkg5.poo.Pra5_3.Almacen;
/**
 *
 * @author aeld
 */
public class Empresa {
    public Integer cantEmpleados;
    public String ubicacion;
    public String director;
    public Double ingresos;
    
    public Empresa(Integer cE, String u, String d, Double i){
        this.cantEmpleados = cE;
        this.ubicacion = u;
        this.director = d;
        this.ingresos = i;
    }
    
    public void inicioTrabajo(){
        System.out.println("La empresa a iniciado sus labores");
    }
    
    public void finTrabajo(){
        System.out.println("La empresa a finalizado sus labores");
    }
    
    public void contPersonal(){
        System.out.println("La empresa está contratando más personal");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner opEmp = new Scanner(System.in);
        System.out.print("Ingrese el tipo de empresa deseado\n[1]Informática\n[2]Bancaria\n[3]Almacen\n[OPCION]: ");
        Integer op = opEmp.nextInt();
        switch(op){
            case 1:
                Informática inf = new Informática(25, "Plaza San Montana", "Ing. Arturo Moreno", 15500.0, 25);
                System.out.print("Empresa Informática\nCantidad de Empleados: " + inf.cantEmpleados.toString() + "\nUbicación: " + inf.ubicacion +
                        "\nDirector: " + inf.director + "\nIngresos: $" + inf.ingresos.toString() + "\nCantidad de Computadoras: " + inf.cantComputadoras);
                inf.revisarSistema();
                inf.mantEquipo();
                break;
            case 2:
                Bancaria banc = new Bancaria(42, "25a Avenida Poniente", "Lic. María Gregoria Cruz", 156000.0, 100000.0, 200);
                System.out.print("Empresa Bancaria\nCantidad de Empleados: " + banc.cantEmpleados.toString() + "\nUbicación: " + banc.ubicacion +
                        "\nDirector: " + banc.director + "\nIngresos: $" + banc.ingresos.toString() + 
                        "\nDeposito del Banco: $" + banc.deposito.toString() + "\nUsuarios: " + banc.usuarios);
                banc.realizarPrestamo();
                banc.depositarEfectivo();
                break;
            case 3:
                String[] almI = new String[]{"Camisas Polo", "Zapatos deportivos", "Vestido de Gala", "Ropa para Bebé"};
                Almacen alm = new Almacen(36, "Centro Comercial Buenavida", "Anastacio Perdomo", 45462.36, almI);
                String cadInv = "";
                for(Integer i = 0; almI.length > i; i++){
                    cadInv = cadInv + "\n" + almI[i];
                }
                System.out.print("Empresa Almacen\nCantidad de Empleados: " + alm.cantEmpleados.toString() + "\nUbicación: " + alm.ubicacion +
                        "\nDirector: " + alm.director + "\nIngresos: $" + alm.ingresos.toString() + "\nIntentario: " + cadInv);
                alm.comprobarinventario();
                alm.realizarVenta();
                break;
        }
    }
}
