/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_5_clase_persona;

/**
 *
 * @author Familia
 */
public class EVA1_PRACTICA_5_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Persona perso1 =  new Persona();
     
       // SECCION DE ESCRITURA: PONER ALORES EN EL OBJETO
       perso1.setNombre("Michelle");
       perso1.setApellidos("Martinez Posada");
       perso1.setEdad(20);
       //  SECCIÓN DE LECTURA: LEEMOS EL CONTENIDO DEL OBJETO
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellidos());
        System.out.println(perso1.getEdad());
        
      
        
    }
    class Persona{
        //ATRIBUTOS -> SON LAS INTERFAZ
        //NO DEBEN SER ACCESIBLE DIRECTAMENTE
        private String nombre;
        private String apellidos;
        private int edad;
        //METODOS:
        //PUBLICOS ->> SON LAS INTERAZ
        // SI SON PARA MANIPULAR LOS ATRUBUTOS HAY UN ESTANDAR
        //EN JAVA 
        //METODOS SET(ESCRITURA9 Y GET (LECTURA)
        //SON OPCIONALES, NO ES OBLIGARIO QUE CADA ATRIBUTO
        //TENGA UN METODO GET Y SET
        //LEER NOMBRE:
        public String getNombre(){
            return nombre;
        }
        //ESCRIBIR NOMBRE:
        public void setNombre(String valor){
            nombre = valor;
        }
        //APELLIDOS
        public String getApellidos(){
            return apellidos;
        }
        public void setApellidos(String valor){
            apellidos = valor;
        }
        //EDAD
        public int getEdad(){
            return edad;
        }
        public void setEdad(int valor){
            edad = valor;
        
    }
}
}