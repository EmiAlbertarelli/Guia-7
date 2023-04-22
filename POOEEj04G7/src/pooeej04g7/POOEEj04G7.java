/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para 
crear el rectángulo con los datos del Rectángulo dados por el usuario. También 
incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que 
dibujará el rectángulo mediante asteriscos usando la base y la altura. Se
deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package pooeej04g7;

import Entidades.Rectangulo;


public class POOEEj04G7 {

    public static void main(String[] args) {
     Rectangulo r1 = new Rectangulo();
        double superficie;
        double perimetro;
        r1.crearRectangulo();
        superficie=r1.Superficie();
        perimetro=r1.Perimetro();
        System.out.println("la superficie es: "+superficie);
        System.out.println("el perimetro es: "+perimetro);
        System.out.println();
        r1.dibujoRectangulo();
    }
}
