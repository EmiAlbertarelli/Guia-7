/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
jugadores jugar un juego de adivinanza de números. El primer jugador elige 
un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El juego termina cuando el segundo jugador adivina el
número o se queda sin intentos. Registra el número de intentos necesarios para 
adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidades;

import java.util.Scanner;


public class Juegos {
    private final int limite = 3;
    private int jugador1;
    private int jugador2;
    
    public Juegos(){
        
    }

    public int getJugador1() {
        return jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }
    
    public void iniciarJuego(){
        Scanner leer = new Scanner(System.in);
        int intentos = 0;
        
        System.out.println("Ingrese el numero");
        this.setJugador1(leer.nextInt());
        do{
            System.out.println("Ingrese el numero a adivinar");
            this.setJugador2(leer.nextInt());
                         if (this.getJugador1()== this.getJugador2()) {
                System.out.println("Usted ha adivinado correctamente!!!");
                break;
            }else if(this.getJugador2()>this.getJugador1()){
                System.out.println("Ingrese un numero mas bajo");
            }else{
                System.out.println("Ingrese un numero mas alto");
            }intentos++;
        }while(intentos<=limite);
        
    }
}
