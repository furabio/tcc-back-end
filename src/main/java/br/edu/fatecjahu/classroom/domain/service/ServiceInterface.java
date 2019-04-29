package br.edu.fatecjahu.classroom.domain.service;

import br.edu.fatecjahu.classroom.domain.model.AbstractEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServiceInterface<T extends AbstractEntity> {

    Page<T> findAll(Pageable pageable);

    T findById(Long id);

    T create(T object);

    T update(T object);

    void deleteById(Long id);

}
