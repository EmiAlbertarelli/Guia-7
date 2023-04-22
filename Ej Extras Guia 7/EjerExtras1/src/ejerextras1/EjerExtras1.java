/* Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
 */
package ejerextras1;

import Entidades.Coche;
import java.util.Scanner;


public class EjerExtras1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         Coche c1 = new Coche();
              
         
         System.out.println("Ingrese la amrca del coche");
         c1.setMarca(leer.nextLine());
         
         System.out.println("Ingrese el modelo del auto");
         c1.setModelo(leer.nextLine());
         
         System.out.println("Ingrese el precio");
         c1.setPrecio(leer.nextInt());

         
        
         c1.mostrar_Datos();
        
    
}
}
