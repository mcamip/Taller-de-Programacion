package com.umb.taller.domain.model;

public class Estudiante extends Usuario {

    public Estudiante(String id, String nombre) {
        super(id, nombre);
    }

    @Override
    public int getMaximoPrestamos() {
        return 3;
    }
}
