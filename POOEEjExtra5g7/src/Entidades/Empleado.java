/* Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y 
"salario". Luego, crea un método "calcular_aumento" que calcule el aumento 
salarial de un empleado en función de su edad y salario actual. El aumento 
salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si 
tiene menos de 30 años.
 */
package Entidades;


public class Empleado {
   private String nombre;
   private int edad;
   private double salario;
   
   public Empleado(){
       
   }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

   public void calcular_aumento(){
       //Scanner leer = new Scanner(System.in);
       //System.out.println("Ingrese su salario");
      // double salario = leer.nextDouble();
    if(this.getEdad()>=30){
        salario = salario*1.10;
    }else {
        salario = salario*1.05;
    }
}
   public String salarioActual(){
       return "Empleado" + 
               "\nNombre: "+nombre+
                "\nEdad: "+edad+
                "\nSaldo: "+salario;
   }
}
