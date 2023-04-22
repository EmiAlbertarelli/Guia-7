/* Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
 */
package Entidades;

import java.util.Scanner;


public class Coche {
    private String marca;
    private String modelo;
    private int precio;

    public Coche() {
    }

    public Coche(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }
    
    
    public void mostrar_Datos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("La marca del coche es: " + this.getModelo() + ", el modelo es " + this.getModelo() + " y su precio es $ " + this.getPrecio());
    }
}
