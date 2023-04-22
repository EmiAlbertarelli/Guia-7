/*
 Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y 
otro para mostrar por pantalla los estudiantes que tienen una nota media superior.
 */
package ejerextra2;

import Entidades.Estudiante;
import java.util.Scanner;


public class EjerExtra2 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante();
        Estudiante e3 = new Estudiante();
        
        e1.calculo_Nota();
    }

   
    
}
