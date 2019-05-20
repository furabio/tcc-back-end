package br.edu.fatecjahu.classroom.domain.service;

import br.edu.fatecjahu.classroom.domain.model.AbstractEntity;
import br.edu.fatecjahu.classroom.application.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public class AbstractService<T extends AbstractEntity, E extends JpaRepository<T, Long>> implements ServiceInterface<T> {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private E repository;

    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public T findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("O id informado não existe"));
    }

    public T update(T object) {
        findById(object.getId());
        return repository.save(object);
    }


    public T create(T object) {
        object.setId(null);
        return repository.save(object);
    }

    public void deleteById(Long id) {
        findById(id);
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new ResourceNotFoundException("Objeto não pode ser deletado, pois possui dependencias.");
        }
    }

    public E getRepository() {
        return repository;
    }
}
