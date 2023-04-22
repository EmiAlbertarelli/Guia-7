package pooej01;

import java.util.Scanner;

import pooej01.Entidad.Persona;


public class POOEj01 {

    
    public static void main(String[] args) {
        
   Scanner leer = new Scanner(System.in);
  
   
        System.out.println("Ingrese los datos de la persona");
   
        Persona p1 = new Persona();
        
        p1.nombre = leer.nextLine();
        p1.apellido = leer.nextLine();
        p1.edad = leer.nextInt();
        
        Persona p2 = new Persona();
        
        System.out.println("Los datos cargados son: "+p1.nombre +" "+ p1.apellido + " "+ p1.edad);
        
      
    }

  
}
