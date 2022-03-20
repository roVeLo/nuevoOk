
package modelo;

 // como definimos, la clase circulo es una derivada de figura. Es decir
//el circulo es una herencia de figura

public class Circulo extends Figuras {
    
    private double radio;
    
    //cuando yo nombre al circulo, atraves del constructor lo alimentos con
    //el numero 4
    
    
    public Circulo (double radio){ //este es el constructor
        
        this.radio = radio; //aqui se alimenta la propiedad
        
    }

    public Circulo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setRadio (double radio){
        
        this.radio = radio;
    }
    
    public double getRadio(){
        
        return radio;
    }
    
    @Override
    public void calcularArea(){ //este es el metodo polimorfico
                                //esta es la definicion del metodo que fue definido en figuras
        
        setArea(3.14 * (radio*radio)); //este es de la clase superior (Figura)
    }
}
 
  
