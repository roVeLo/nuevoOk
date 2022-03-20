
package calculodeareas;


import modelo.Circulo;
import modelo.Rectangulo;
import modelo.Triangulo;


public class CalculoDeAreas {

    public static void main(String[] args) {
       
        Circulo f1 = new Circulo(4); //aqui se ejecuta un constructor de la clase circulo, quien recibe un dato que alimenta la propiedad radio
        Rectangulo f2 = new Rectangulo(5,6);
        Triangulo f3 = new Triangulo(6,3);
        
        f1.calcularArea();//DESPUES DIGO QUE SE EJECUTE EL METODO POLIMORFICO
        f2.calcularArea();
        f3.calcularArea();
        
        System.out.println(f1.getArea());
        System.out.println(f2.getArea());
        System.out.println(f3.getArea());
    }
    
}
