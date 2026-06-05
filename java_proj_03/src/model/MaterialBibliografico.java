package model;

public class MaterialBibliografico {

    //Atributos
    protected int codigo;
    protected String titulo;
    protected boolean puedePrestarse;
    protected boolean disponible;
    protected String tipo;

    
    public MaterialBibliografico(int codigo, String titulo, boolean puedePrestarse, boolean disponible, String tipo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.puedePrestarse = puedePrestarse;
        this.disponible = disponible;
        this.tipo = tipo;
    }


    public void mostrarInfo() {
        System.out.println("Código" + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("¿Puede prestarse? " + puedePrestarse);
        System.out.println("Disponible: " + disponible);
        System.out.println("Tipo: " + tipo);
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPuedePrestarse() {
        return puedePrestarse;
    }

    public void setPuedePrestarse(boolean puedePrestarse) {
        this.puedePrestarse = puedePrestarse;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
