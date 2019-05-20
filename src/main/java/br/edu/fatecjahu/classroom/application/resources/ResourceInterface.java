package br.edu.fatecjahu.classroom.application.resources;

import br.edu.fatecjahu.classroom.domain.model.AbstractEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public interface ResourceInterface<T extends AbstractEntity> {

    @GetMapping
    ResponseEntity<Page<T>> findAll(Pageable pageable);

    @GetMapping("/{id}")
    ResponseEntity<T> findById(Long id);

    @PostMapping
    ResponseEntity<T> create(T object);

    @PutMapping("/{id}")
    ResponseEntity<T> update(Long id, T objeto);

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteById(Long id);

}
