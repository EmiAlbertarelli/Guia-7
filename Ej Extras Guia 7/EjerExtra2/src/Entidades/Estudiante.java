/*
 Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y 
otro para mostrar por pantalla los estudiantes que tienen una nota media superior.
 */
package Entidades;

import java.util.Scanner;


public class Estudiante {
 private String nombre;
 private int edad;
 private double nota_media;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double nota_media) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota_media = nota_media;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota_media() {
        return nota_media;
    }
 
 public void calculo_Nota(){
     Scanner leer = new Scanner(System.in).useDelimiter("\n");// para que salte de linea entre un string y otro
     
     double contNotas=0;
     int contEstudiantes=0;
     String respuesta;
     
     do{
         System.out.println("Ingresar el nombre del estudiante " );
         this.setNombre(leer.next());
         
         System.out.println("Ingrese la edad de " + this.getNombre());
         this.setEdad(leer.nextInt());
         
         System.out.println("Ingresa la nota de " + this.getNombre());
         this.setNota_media(leer.nextDouble());
         
         contNotas = this.getNota_media() + contNotas;
         contEstudiantes++;
         
         
         System.out.println("Queres cargar otro estudiante?");
         respuesta = leer.next();
         
     }while(respuesta.equalsIgnoreCase("si"));
     
     System.out.println("El promeio de las notas es: " + (contNotas)/contEstudiantes);
 }
  public void mostrar_mejoresPromedios(){
      
  }
}
