/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_metodos_practica_7_;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class EVA1_METODOS_PRACTICA_7_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Juan");
        perso.setApellidos("Pérez");
        perso.setEdad(50);
        System.out.println("El nombre es"+ perso.generarNombreCom());
        System.out.println("Nacio en el año: "+ perso.calcularAnnioNac());
        //----
        Persona[] grupo = new Persona[5];
        //----
        for (int i = 0; i < grupo.length; i++) {
            Scanner input = new Scanner(System.in );
         grupo[i] = new Persona();
         //Una vez creado el objeto, Hay que llenarlo;
            System.out.println("Introduce el nombre:");
            String nombre = input.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introduce el apellido:");
            String ape = input.nextLine();
            grupo[i].setApellidos(ape);
            
             System.out.println("Introduce La edad");
             int edad = input.nextInt();
             grupo[i].setEdad(edad);
      
        }
        //LEER 
       for (int i = 0; i < grupo.length; i++) {
           System.out.println("El nombre es" + grupo[i].generarNombreCom());
           System.out.println("Ncio en el año: "+ grupo[i].calcularAnnioNac());
           
        }
            
        }
    }
    
    

