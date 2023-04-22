package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
        Mascota m1 = new Mascota();
        
        m1.apodo = "Chiquito";
        m1.nombre = leer.next();
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Beagle";
        m1.cola = true;
        m1.color = "Tricolor";
        
        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo);
        
    }
    
}
