/* Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y 
"salario". Luego, crea un método "calcular_aumento" que calcule el aumento 
salarial de un empleado en función de su edad y salario actual. El aumento 
salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si 
tiene menos de 30 años.
 */
package pooeejextra5g7;

import Entidades.Empleado;
import java.util.Scanner;


public class POOEEjExtra5g7 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
       System.out.println("Ingrese su salario");
        double salario = leer.nextDouble();
        
        Empleado e1 = new Empleado(nombre,edad,salario);
        e1.calcular_aumento();
        System.out.println(e1.salarioActual());
    }
    
}
