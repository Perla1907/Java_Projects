import model.*;

import java.util.Scanner;

import service.BibliotecaService;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        BibliotecaService bibliotecaService = new BibliotecaService();

        int opcion;
        int opcionAgregar;
        int codigo = 0;
        String titulo = "";
        boolean puedePrestarse = true;


        do {

            System.out.println("\n========== MENÚ BIBLIOTECA ==========");
            System.out.println("1.- Agregar Material Bibliografico");
            System.out.println("2.- Agregar Alumno");
            System.out.println("3.- Agregar Prestamo");
            System.out.println("4.- Mostrar Alumnos");
            System.out.println("5.- Mostrar Prestanos");
            System.out.println("6.- Mostrar Material Bibliografico");
            System.out.println("7.- Salir");

            System.out.print("\nIngrese una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {

                case 1:

                    System.out.println("--------------- Agregar ---------------\n");
                    System.out.println("1.- Agregar Libro");
                    System.out.println("2.- Agregar Periodico");
                    System.out.println("3.- Agregar Revista");
                    System.out.println("4.- Agregar Tesis");
                    
                    System.out.print("\nIngrese una opción: ");
                    opcionAgregar = sc.nextInt();

                    System.out.print("Código: ");
                    codigo = sc.nextInt();

                    System.out.print("Título: ");
                    titulo = sc.next();

                    System.out.print("¿Puede presatrse?: ");
                    puedePrestarse = sc.nextBoolean();
                    sc.nextLine();

                    switch (opcionAgregar) {
        
                        case 1:

                            System.out.print("Autor: ");
                            String autor = sc.nextLine();

                            System.out.print("ISBN: ");
                            String isbn = sc.nextLine();

                            System.out.print("Editorial: ");
                            String editorial = sc.nextLine();

                            System.out.print("Paginas: ");
                            int paginas = sc.nextInt();

                            Libro libro = new Libro(codigo, titulo, puedePrestarse, true, "Libro", autor, isbn, editorial, paginas);

                            bibliotecaService.agregarMaterial(libro);

                            break;

                        case 2: 

                            System.out.print("Fecha de Publicación: ");
                            String fechaPublicacion = sc.nextLine();

                            System.out.print("Nombre: ");
                            String nombre = sc.nextLine();

                            System.out.print("Sección: ");
                            String seccion = sc.nextLine();

                            Periodico periodico = new Periodico(codigo, titulo, puedePrestarse, true, "Periodico", fechaPublicacion, nombre, seccion);

                            bibliotecaService.agregarMaterial(periodico);
                            break;

                        case 3:

                         System.out.print("Número de edición: ");
                            int noEdicion = sc.nextInt();

                            System.out.print("Mes de publicación: ");
                            String mesPub = sc.nextLine();

                            System.out.print("Categoria: ");
                            String categoria = sc.nextLine();

                            Revista revista = new Revista(codigo, titulo, puedePrestarse, true, "Revista", noEdicion, mesPub, categoria);

                            bibliotecaService.agregarMaterial(revista);
                            break;
                        
                        case 4:

                         System.out.print("Autor: ");
                            String autorTesis = sc.nextLine();

                            System.out.print("Carrera: ");
                            String carrera = sc.nextLine();

                            System.out.print("Año de Publicación: ");
                            int anioPublicacion = sc.nextInt();

                            System.out.print("Director: ");
                            String carredirectorra = sc.nextLine();

                            Tesis tesis = new Tesis(codigo, titulo, puedePrestarse, true, "Tesis", autorTesis, carrera, anioPublicacion, carredirectorra);

                            bibliotecaService.agregarMaterial(tesis);
                            break;

                    }
            }

        } while (opcion != 5);

    }
}