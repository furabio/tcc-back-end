package br.edu.fatecjahu.classroom.application.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 677919403023367864L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
