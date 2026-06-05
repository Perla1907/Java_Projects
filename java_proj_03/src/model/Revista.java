package model;

public class Revista extends MaterialBibliografico{

    //Atributos
    private int noEdicion;
    private String mesPub;
    private String categoria;


    public Revista(int codigo, String titulo, boolean puedePrestarse, boolean disponible, String tipo, int noEdicion, String mesPub, String categoria) {
        super(codigo, titulo, puedePrestarse, disponible, tipo);

        this.noEdicion = noEdicion;
        this.mesPub = mesPub;
        this.categoria = categoria;
    }


    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de edición: " + noEdicion);
        System.out.println("Mes de publicación: " + mesPub);
        System.out.println("Categoría: " + categoria);
    }

    

    
}
