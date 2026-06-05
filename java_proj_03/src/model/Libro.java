package model;

public class Libro extends MaterialBibliografico{

    //Atributos
    private String autor;
    private String isbn;
    private String editorial;
    private int paginas;

    public Libro(int codigo, String titulo, boolean puedePrestarse, boolean disponible, String tipo, String autor, String isbn, String editorial, int paginas){
        super(codigo, titulo, puedePrestarse, disponible, tipo);
        this.autor = autor;
        this.isbn  = isbn;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Editorial: " + editorial);
        System.out.println("Paginas: " + paginas);
    }

    

    

}
