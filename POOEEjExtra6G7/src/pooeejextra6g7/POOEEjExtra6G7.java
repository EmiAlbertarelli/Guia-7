/* Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
"calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un 
objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el 
área del rectángulo.
 */
package pooeejextra6g7;

import Entidades.Rectangulo;



public class POOEEjExtra6G7 {

   
    public static void main(String[] args) {
        
        
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        
        rectangulo1.calcular_area();
    }
    
}
