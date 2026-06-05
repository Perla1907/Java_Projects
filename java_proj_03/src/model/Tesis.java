package model;

public class Tesis extends MaterialBibliografico{

    //Atributos
    private String autor;
    private  String carrera;
    private int anioPublicacion;
    private String director;


    public Tesis(int codigo, String titulo, boolean puedePrestarse, boolean disponible, String tipo, String autor, String carrera, int anioPublicacion, String director) {
        super(codigo, titulo, puedePrestarse, disponible, tipo);
        
        this.autor = autor;
        this.carrera = carrera;
        this.anioPublicacion = anioPublicacion;
        this.director = director;
    }


    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Carrera: " + carrera);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Director: " + director);
    }

    

}
