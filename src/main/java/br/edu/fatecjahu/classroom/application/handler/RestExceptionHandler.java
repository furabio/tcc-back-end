package br.edu.fatecjahu.classroom.application.handler;

import br.edu.fatecjahu.classroom.application.exceptions.ClassroomException;
import br.edu.fatecjahu.classroom.application.exceptions.ErrorDetails;
import br.edu.fatecjahu.classroom.application.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handlerResourceNotFoundException(ResourceNotFoundException e) {
        ErrorDetails errorDetails = ErrorDetails.Builder.builder()
                .title("Resource not found")
                .detail(e.getMessage())
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.NOT_FOUND.value())
                .developerMessage(e.getClass().getName())
                .build();
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ClassroomException.class)
    public ResponseEntity<ErrorDetails> handlerClassroomException(ClassroomException e) {
        ErrorDetails errorDetails = ErrorDetails.Builder.builder()
                .title("Classroom Error")
                .detail(e.getMessage())
                .timestamp(LocalDateTime.now())
                .status(e.getHttpStatus().value())
                .developerMessage(e.getClass().getName())
                .build();
        return new ResponseEntity<>(errorDetails, HttpStatus.PRECONDITION_FAILED);
    }
}
