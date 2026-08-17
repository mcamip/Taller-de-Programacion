package com.umb.taller.domain.model;

public class Profesor extends Usuario {

    public Profesor(String id, String nombre) {
        super(id, nombre);
    }

    @Override
    public int getMaximoPrestamos() {
        return 10;
    }
}