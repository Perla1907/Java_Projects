public class Persona {
    //Propiedades o atributos
    private String nombre;
    private int edad;
    private double peso;
    private double estatura;
    private double imc;

    //Método constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void calcularIMC() {
        this.imc = peso/(this.estatura * this.estatura);
    }

    public double getIMC() {
        return imc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}