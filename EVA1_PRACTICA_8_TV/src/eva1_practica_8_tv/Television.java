/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_8_tv;

/**
 *
 * @author Familia
 */
public class Television {
    //ATRIVUTOS
    int volumen;
        int Canal;
        boolean estaEncendida;
        
        // constructor
        //connsturctor sin argumento: constructor default
        //metodo para inicializar los objetos
        public Television(){
            //NO ES OBLIGARTORIO 
            
        volumen =3;
        Canal =5;
        estaEncendida = false;
        
        
        }
        
        public void subirVolumen(){
            if(estaEncendida && (volumen < 100))
            volumen = volumen +1;
  
            //volumen +=1;
            //volumen ++;
        }
        public void bajarVolumen(){
             if(estaEncendida && (volumen < 0))
            volumen = volumen -1;
          
        }
         public void subirCanal(){
            Canal = Canal +1;

        }
        public void bajarCanal (){
            if(estaEncendida && (Canal > 0))
            Canal  = Canal -1;
          
        }
        public void cambiarCanal(int noCanal){
            //! ----> negacion 
            if (estaEncendida && ! (noCanal <0))
            Canal = noCanal;
            
        }
        public void power(){
            if(estaEncendida == true) 
                estaEncendida = false;
            else
                estaEncendida = true;
            estaEncendida =!estaEncendida;
            
            
      }
        public void imprimirConfig(){
            System.out.println("Volumen ;" + volumen);
            System.out.println("Canal;" + Canal);
            System.out.println("power;" + estaEncendida);
            
        }
}
