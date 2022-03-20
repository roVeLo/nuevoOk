
package modelo;


public class Triangulo extends Figuras {
    
    private double base, altura;
    
    
    
    public Triangulo (double base, double altura){ //este es el constructor
        
        this.base = base; //aqui se alimenta la propiedad
        this.altura = altura; //aqui se alimenta la propiedad
        
    }
    
    public void setBase(double base){     /*Aqui estaria cumpliendo la encapsulacion 
                                              como son dos propiedades tendra un set y get para cada uno*/
        this.base = base;
    }
    
    public void setAltura(double altura){
        
        this.altura = altura;
    }
    
    public double getBase(){
        
        return base;

    }
    
     public double getAltura(){
        
        return altura;

    }
    
    
    @Override
    public void calcularArea(){ //este es el metodo polimorfico
                                //esta es la definicion del metodo que fue definido en figuras
        
        setArea((base*altura)/2); //a ese calculo lo asigno en la propiedad AREA de la clase figuras
    }
}
 

    

