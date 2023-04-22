/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar un 
libro pidiendo los datos al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el número de páginas.
*/
package pooej1g7;

import Entidades.Libro;
import java.util.Scanner;

public class POOEj1G7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);

        Libro l1 = new Libro();
        System.out.println("Ingrese los datos del libro: ISBN, autor, titulo, cantidad de paginas");

        l1.cargarLibro();
        l1.mostrarDatos();
        
    }
}

    
