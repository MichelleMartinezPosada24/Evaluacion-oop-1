/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_super;

/**
 *
 * @author Michelle
 */
public class Estudiante extends Persona {
   private String noControl;
   private String carrera;
   
   public Estudiante(){
       super();
       noControl = "------";
       carrera = "-------";
       
       
   }
   // REGLA DE HERRENCIA; SIEMPRE HAY QUE LLAMAR AL CONSTRUCTOR DE LA SUPER CLASE
   // SIEMPRE TIENE QUE SER LA PRIMERA INSTRUCCION DEL CONSTRUCTOR 
  public Estudiante (String nombre, String apPaterno, String apMaterno, int edad, char genero, String noControl, String carrera){
   super(nombre, apPaterno, apMaterno, edad, genero);
   this.noControl = noControl;
   this.carrera = carrera;
   
}
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
   @Override
   public void imprimirDatos(){
       super.imprimirDatos();
       System.out.println("No de control; " + noControl);
       System.out.println("Carrera: "+ carrera);
       
   }
}

