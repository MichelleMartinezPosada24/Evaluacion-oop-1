/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_metodos_practica_7_;

/**
 *
 * @author Familia
 */
public class Persona {
    /*Nombre, apellidos, edad*/
    private String nombre;
    private String apellidos;
    private int edad;
    
    // metodos get y set
    public String getNombre (){
        return nombre;
    }
    public void setNombre(String valor) {
        nombre = valor;
    }
    public String getApellidos(){
    return nombre;
    }
    public void setApellidos (String valor){
        apellidos = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public String generarNombreCom(){
        return nombre +" " + apellidos;
    }
    //calcular año de nacimiento 
    public int calcularAnnioNac(){
        return 2024 - edad;
    }
  
        
    
}
