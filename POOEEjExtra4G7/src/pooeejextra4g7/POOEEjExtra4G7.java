/* Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.
 */
package pooeejextra4g7;

import Entidades.Cuenta;
import java.util.Scanner;


public class POOEEjExtra4G7 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double saldo;
       String titular;
        System.out.println("Cargue el nombre del titular");
        titular = leer.nextLine();
        System.out.println("Cargue el saldo que tiene: ");
        saldo = leer.nextDouble();
        Cuenta cuenta = new Cuenta(saldo, titular);
        System.out.println("Desea retirar dinero? s/n");
        String op = leer.next();
        switch(op){
            case "s":
            case"S":
                cuenta.retirar_dinero();
                break;
            default:
                System.out.println("Hasta luego");
                
            }
            
        }
        
        
    }
    

