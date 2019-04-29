package br.edu.fatecjahu.classroom.resources;

import br.edu.fatecjahu.classroom.domain.model.AbstractEntity;
import br.edu.fatecjahu.classroom.domain.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public class AbstractResource<T extends AbstractEntity, S extends ServiceInterface<T>> implements ResourceInterface<T> {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private S service;

    @GetMapping
    public ResponseEntity<Page<T>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }


    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<T> create(@Valid @RequestBody T object) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(object));
    }

    @PutMapping
    public ResponseEntity<T> update(@PathVariable("id") Long id, @Valid @RequestBody T object) {
        object.setId(id);
        service.update(object);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
