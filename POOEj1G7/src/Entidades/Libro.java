
package Entidades;

import java.util.Scanner;


public class Libro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int cantidad;
    
    public Libro(){// Constructor vacio
        
    }
// Constructor solicitando datos
    public Libro(int ISBN, String titulo, String autor, int cantidad) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
    }
public void cargarLibro(){// metodo para la carga del libro
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    ISBN = leer2.nextInt();
    autor = leer.nextLine();
    titulo = leer.nextLine();
    cantidad = leer2.nextInt();
}
        
    public void mostrarDatos(){// metodo para la muestra de los datos solicitados
        System.out.println("Los datos cargados son: num ISBN: "+ ISBN + ", autor: "+ autor + ", titulo: "+ titulo + " y la cantidad de " + cantidad + " paginas");
    }
}
