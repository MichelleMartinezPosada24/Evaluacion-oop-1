/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_3_modificadores_acceso;

import PAQUETE_1.CLASE_1;

/**
 *
 * @author Familia
 */
public class EVA1_PRACTICA_3_MODIFICADORES_ACCESO {
 public int x;
 protected int y;
 private int z;
 int w;
 
  
    public static void main(String[] args) {
        // TODO code application logic here
        //PruebaA es default
        PruebaA objA = new PruebaA ();
        //objA. --> puedo ver x (public)
        //´Puedo ver a y (protected)
        //puedo ver a w (default)
        CLASE_1 otroObj = new CLASE_1();
        // otroObj.x --> se ve x porque es publico
        // los demas no son visibles
        //esta clase no es visible en ese paquete
        //PruebaB objB = new PruebaB();
    }
    
}
//Clase con acceso defautl
class PruebaA{
    public int x;
 protected int y;
 private int z;
 int w;
}