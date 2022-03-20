
package modelo;


public class Rectangulo extends Figuras {
    
    private double lado1, lado2;
    
    
    
    public Rectangulo (double lado1, double lado2){ //este es el constructor
        
        this.lado1 = lado1; //aqui se alimenta la propiedad
        this.lado2 = lado2; //aqui se alimenta la propiedad
        
    }
    
    public void setLado1(double lado1){     /*Aqui estaria cumpliendo la encapsulacion 
                                              como son dos propiedades tendra un set y get para cada uno*/
        this.lado1 = lado1;
    }
    
    public void setLado2(double lado2){
        
        this.lado2 = lado2;
    }
    
    public double getLado1(){
        
        return lado1;

    }
    
     public double getLado2(){
        
        return lado2;

    }
    
    
    @Override
    public void calcularArea(){ //este es el metodo polimorfico
                                //esta es la definicion del metodo que fue definido en figuras
        
        setArea(lado1*lado2); //a ese calculo lo asigno en la propiedad AREA de la clase figuras
    }
}
 
  
