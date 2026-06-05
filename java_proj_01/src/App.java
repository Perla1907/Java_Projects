import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Ejemplo de instancia de objetos
        Persona p01 = new Persona("Juan", 17);

        //Como ingresar datos pero del teclado con la clase Scanner
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuánto pesa la persona?");

        p01.setPeso(lector.nextDouble());
        
        //p01.setPeso(60.5); //Uso de método Set
        p01.setEstatura(1.75);
        p01.calcularIMC(); 

        //Le puedo cambiar el nombre a Juan
        //p01.nombre =  "Miguel" //Principio de ENCAPSULAMIENTO

        System.out.println("Nombre: " + p01.getNombre());
        System.out.println("Edad: " + p01.getEdad());
        System.out.println("Peso: " + p01.getPeso());
        System.out.println("Estatura: " + p01.getEstatura());
        System.out.println("IMC: " + p01.getIMC());
    }
}
