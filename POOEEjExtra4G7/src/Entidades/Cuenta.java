/* Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.
 */
package Entidades;

import java.util.Scanner;


public class Cuenta {
    
    private double saldo;
    private String titular;
    public Cuenta(double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero(){
      Scanner leer = new Scanner(System.in);
        System.out.println("Su saldo es de: " + saldo);
        System.out.println("Digite el monto que desea retirar: ");
        double retiro = leer.nextDouble();
        
        if (retiro<saldo) {
            saldo = saldo - retiro;
            System.out.println("Su saldo actual es el: " + saldo);
            
        }else{
            System.out.println("ERROR: no puede retirar mas de lo que dispone");
        }
    }
}
