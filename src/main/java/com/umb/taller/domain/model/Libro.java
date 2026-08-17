package com.umb.taller.domain.model;

public class Libro {

    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(String titulo, Autor autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        if (!disponible) {
            throw new IllegalStateException("El libro ya está prestado");
        }

        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    @Override
    public String toString() {
        return titulo + " por " + autor + " (" + anioPublicacion + ")";
    }
}