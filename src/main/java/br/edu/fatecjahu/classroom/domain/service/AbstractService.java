package br.edu.fatecjahu.classroom.domain.service;

import br.edu.fatecjahu.classroom.domain.model.AbstractEntity;
import br.edu.fatecjahu.classroom.resources.exceptions.ClassroomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;

public class AbstractService<T extends AbstractEntity, E extends JpaRepository<T, Long>> implements ServiceInterface<T> {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private E repository;

    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public T findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ClassroomException("O id informado não existe", HttpStatus.NOT_FOUND));
    }

    public T update(T object) {
        findById(object.getId());
        try {
            return repository.save(object);
        } catch (DataIntegrityViolationException e) {
            throw new ClassroomException("Não é possível atualizar objeto", HttpStatus.CONFLICT);
        }
    }


    public T create(T object) {
        object.setId(null);
        try {
            return repository.save(object);

        } catch (DataIntegrityViolationException e) {
            throw new ClassroomException("Conflito com integridade.", HttpStatus.CONFLICT);
        }
    }

    public void deleteById(Long id) {
        findById(id);
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new ClassroomException("Objeto com dependencias.", HttpStatus.UNAUTHORIZED);
        }
    }

    public E getRepository() {
        return repository;
    }
}
