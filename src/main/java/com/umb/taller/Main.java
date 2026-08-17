package com.umb.taller;

import com.umb.taller.domain.model.Autor;
import com.umb.taller.domain.model.Estudiante;
import com.umb.taller.domain.model.Libro;
import com.umb.taller.domain.model.Profesor;
import com.umb.taller.domain.model.Usuario;

public class Main {

public static void main(String[] args) {

        // Crear un autor
        Autor autor = new Autor(
                "Gabriel García Márquez",
                "Colombiana"
        );

        // Crear un libro
        Libro libro = new Libro(
                "Cien años de soledad",
                autor,
                1967
        );

        // Crear usuarios
        Usuario estudiante = new Estudiante(
                "E001",
                "Camila"
        );

        Usuario profesor = new Profesor(
                "P001",
                "Carlos"
        );

        // Mostrar información
        System.out.println("=== BIBLIOTECA ===");

        System.out.println("\nLibro:");
        System.out.println(libro);

        System.out.println("\nDisponibilidad inicial:");
        System.out.println(libro.isDisponible());

        // Prestar libro
        libro.prestar();

        System.out.println("\nDespués de prestar el libro:");
        System.out.println(libro.isDisponible());

        // Devolver libro
        libro.devolver();

        System.out.println("\nDespués de devolver el libro:");
        System.out.println(libro.isDisponible());

        // Información de usuarios
        System.out.println("\nUsuarios:");

        System.out.println(
                estudiante.getNombre()
                        + " puede pedir "
                        + estudiante.getMaximoPrestamos()
                        + " libros."
        );

        System.out.println(
                profesor.getNombre()
                        + " puede pedir "
                        + profesor.getMaximoPrestamos()
                        + " libros."
        );
        }
}
