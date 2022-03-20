/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public abstract class Figuras { //si bien, no tenemos clases circulo y demas es xq son figuras que es la clase
                                //superior

          private double area;
          
          public void setArea (double area) { //esto es un mutador, lo muta a un float area. Void xq no retorna nada
              
              this.area = area;   // va a mutar a el area, se pone this xq coinciden los nombres creo
          } 
          
          public double getArea(){  //este es el asesor, no contiene parametros, y lo que hace es devolverme
                                    //el area
              return area;
          }
          
          /* lo que ahora necesito es definir un metodo polimorfico con respecto a la herencia, xq circulo
          va a heredar de figura, el tendra su propiedad area y su radio en figura porque hereda de el
          */
          
          public abstract void calcularArea();
}
