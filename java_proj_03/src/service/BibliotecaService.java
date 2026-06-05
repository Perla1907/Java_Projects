package service;

import java.util.ArrayList;

import model.Alumno;
import model.MaterialBibliografico;
import model.Prestamo;

public class BibliotecaService {
    //Atributos
    private ArrayList<MaterialBibliografico> materiales = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public void agregarMaterial(MaterialBibliografico material){
        materiales.add(material);
    }

    public void agregarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }

    public void mostarAlumnos(){
        System.out.println("\n--------------- ALUMNOS ---------------\n");
        System.out.println("----------------------------------------");
        for (Alumno alumno : alumnos) {
            alumno.mostrarInfo();
        }
        System.out.println("----------------------------------------\n");
    }

    public void mostarMateriales(){
         System.out.println("\n--------------- MATERIAL BIBLIOGRAFICO ---------------\n");
        System.out.println("----------------------------------------");
        for (MaterialBibliografico material : materiales) {
            material.mostrarInfo();
        }
        System.out.println("----------------------------------------\n");
    }

    public void mostarPrestamos(){
         System.out.println("\n--------------- Prestamos ---------------\n");
        System.out.println("----------------------------------------");
        for (Prestamo prestamo : prestamos) {
            prestamo.mostrarInfo();
        }
        System.out.println("----------------------------------------\n");
    }

}
