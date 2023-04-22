/*Declarar una clase llamada Circunferencia que tenga como atributo privado el
radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el 
atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
package Entidades;

import java.util.Scanner;


public class Circunferencia {// clase publica para traer informacion de otro lado

    Scanner leer = new Scanner(System.in);

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {// metodo set radio
        this.radio = radio;
        
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia() {
        double radio;
        System.out.println("Ingrese el radio de la circunferencia");
        radio = leer.nextDouble();
        this.radio = radio;

    }

    public double area() {
       return Math.PI * Math.pow(radio, 2);
       
    }
    
    public double perimetro() {
       return 2 * Math.PI * radio;
    
    }
}
 