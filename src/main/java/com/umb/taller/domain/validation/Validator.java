package com.umb.taller.domain.validation;

@FunctionalInterface
public interface Validator<T> {

    boolean validate(T value);
}