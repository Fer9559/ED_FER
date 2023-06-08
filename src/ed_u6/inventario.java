/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_u6;

/**
 *
 * @author Fomento Ocupacional
 */
public class inventario {
  
    public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*Descuento_Varios;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }else {
            Total = precioProducto*Descuento_Pocos;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }   

    }
    private static final double Descuento_Pocos = 0.95;
    private static final double Descuento_Varios = 0.8;
    
}
