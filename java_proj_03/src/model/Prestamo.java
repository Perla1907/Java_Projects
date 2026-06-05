package model;

public class Prestamo {
    //Atributos
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Alumno alumno;
    private MaterialBibliografico material;

    
    public Prestamo(String fechaPrestamo, String fechaDevolucion, Alumno alumno, MaterialBibliografico material) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.alumno = alumno;
        this.material = material;
    }


    public String getFechaDevolucion() {
        return fechaDevolucion;
    }


    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void mostrarInfo() {
        System.out.println("Alumno: " + alumno.getNombre());
        System.out.println("Material Bibliografico: " + material.getTitulo());
        System.out.println("Fecha de Prestamo: " + fechaPrestamo);
        System.out.println("Fecha de Devoluvión: " + fechaDevolucion);
    }
}
