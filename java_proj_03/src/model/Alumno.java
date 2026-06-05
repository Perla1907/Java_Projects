package model;

public class Alumno {
    //Atributos
    private String matricula;
    private String nombre;
    private String carrera;
    private int cuatrimeste;
    private String correo;
    private int prestamosActivos;

    
    public Alumno(String matricula, String nombre, String carrera, int cuatrimeste, String correo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.cuatrimeste = cuatrimeste;
        this.correo = correo;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCarrera() {
        return carrera;
    }


    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    public int getCuatrimeste() {
        return cuatrimeste;
    }


    public void setCuatrimeste(int cuatrimeste) {
        this.cuatrimeste = cuatrimeste;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public int getPrestamosActivos() {
        return prestamosActivos;
    }


    public void setPrestamosActivos(int prestamosActivos) {
        this.prestamosActivos = prestamosActivos;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("Cuatrimestre: " + cuatrimeste);
        System.out.println("Correo: " + correo);
        System.out.println("Prestamos activos: " + prestamosActivos);
    }
}
