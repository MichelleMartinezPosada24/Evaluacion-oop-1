/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_6_vehiculo;

/**
 *
 * @author Familia
 */
public class EVA1_PRACTICA_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vehiculo miCarrito = new vehiculo ();
        
        miCarrito.setMarca(valor:"Ford");
        miCarrito.setAnnio(valor:2004)
        miCarrito.setColor(valor:"Negro");
        miCarrito.setPrecio(valor:22000);
        miCarrito.setModelo(valor:"F150");
        
        
        System.out.println("El año del carro es "+ miCarrito.get.Annio());
        System.out.println("La Marca del carro es "+ miCarrito.getMarca());
        System.out.println("El modelo es "+ miCarrito.getModelo());
        System.out.println("El color es "+ miCarrito.getColor());
        System.out.println("El precio en pesos es de "+ miCarrito.gePrecio());        
        
        
    }
    
}
