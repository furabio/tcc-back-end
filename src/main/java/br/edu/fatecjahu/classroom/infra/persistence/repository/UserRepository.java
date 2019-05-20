package br.edu.fatecjahu.classroom.infra.persistence.repository;

import br.edu.fatecjahu.classroom.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
