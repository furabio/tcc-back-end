package br.edu.fatecjahu.classroom.resources.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ClassroomException extends RuntimeException {
    private static final long serialVersionUID = 677919403023367864L;

    private HttpStatus httpStatus;

    public ClassroomException(String message, HttpStatus httpStatus) {
        super(message);
        this.getHttpStatus();
    }
}
