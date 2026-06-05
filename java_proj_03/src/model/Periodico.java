package model;

import java.nio.channels.Pipe.SourceChannel;

public class Periodico extends MaterialBibliografico{
    //Atributos
    private String fechaPublicacion;
    private String nombre;
    private String seccion;

    public Periodico(int codigo, String titulo, boolean puedePrestarse, boolean disponible, String tipo,
            String fechaPublicacion, String nombre, String seccion) {

        super(codigo, titulo, puedePrestarse, disponible, tipo);
        this.fechaPublicacion = fechaPublicacion;
        this.nombre = nombre;
        this.seccion = seccion;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Fecha de Publicación: " + fechaPublicacion);
        System.out.println("Nombre: " + nombre);
        System.out.println("Sección: " + seccion);
    }
    
}
