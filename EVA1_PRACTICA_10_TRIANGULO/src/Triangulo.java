/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(){
        base = -1;
        altura = -1;
    }
    public void setBase(double valor){
        base = valor;
        
    }
   public void setAltura (double valor){
       altura = valor;
   }
   public double getBase(){
       return base;
   }
   public double getAltura(){
       return altura;
       
   }
   private double calcularArea(){
       return (base * altura )/2;
       
   }
   private double calcularPeri(){
        double peri;
        peri = base + altura + (Math.sqrt(Math.pow(base,2)+Math.pow(altura,2)));
        return peri;
   }
   
   public void imprimirDatos(){
       System.out.println("El área del triangulo es: ");
       System.out.println("El perimetro del triangulo es; " + calcularArea());
       System.out.println("El perimetrotro del trinagulo es:" + calcularPeri());
       
   }
}
