/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_2_instanciacion;

/**
 *
 * @author Familia
 */
public class EVA1_PRACTICA_2_INSTANCIACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int valor =100;
     //INSTANCIACION: Crear el objeto --->sarle memoria
     //CLASE IDENTIFICADOR = new Constructor ();
     // Constructór --> Método con el mismo nombre que la clase.
     Persona persol =new Persona();
        System.out.println( persol);
        // persol -->direccion de memoria
        Vehiculo manual  = new Vehiculo ();
        System.out.println(manual);
        manual.annio =2024;
        manual.marca = "malibu";
        manual.modelo = "Ma240";
        System.out.println("Marca:"+ manual.marca);
        System.out.println("Annio:"+ manual.annio);
        System.out.println("Modelo:"+ manual.modelo);
        
                
             
    }
    
}
// TIPO DE DATO 
class Persona{
   
}
class Vehiculo{
    //Atributos 
    
    String marca;
    int annio;
    String modelo;
    
}