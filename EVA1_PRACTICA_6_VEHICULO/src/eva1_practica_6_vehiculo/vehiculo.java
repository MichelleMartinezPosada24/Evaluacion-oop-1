package eva1_practica_6_vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class vehiculo {
    /*MARCA
    MODELO 
    AÑO
    COLOR
    PLACA
    VALOR 
    */
    private String marca;
     private String modelo;
      private int  annio;
       private String color;
         private double Precio;
        
    //COMPORTAMIENTO DE LA CLASE:METODOS GET Y SET (INTERFAZ)
         public String getMarca(){
             return marca;
         }
         public void setMarca(String valor){
             marca = valor;
         }
         public String getModelo(){
             return modelo;
         }
         public void setModelo(String valor){
             modelo = valor;
         }
         public int getAnnio(){
             return annio;
         }
         public int getAnnio(int valor){
             annio = valor ;
         }
         
         public void getColor(){
             return color;
         }
       public void setColor(){
           color = valor;
       }
       public String getColor(){
           color = valor;
           

}
    
        
  }   