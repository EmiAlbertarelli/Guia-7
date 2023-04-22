
package pooeej02g7;

import Entidades.Circunferencia;
import java.util.Scanner;

public class POOEEj02G7 {

       public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Circunferencia circulo = new Circunferencia(0);
        circulo.crearCircunferencia();
        System.out.println("El radio es: " + circulo.getRadio());
        System.out.println("El area es: " + circulo.area());
        System.out.println("El perimetro es: " + circulo.perimetro());

    }

}
